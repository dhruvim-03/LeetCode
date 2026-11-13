-- SELECT Department.name AS Department ,Employee.name AS Employee, Employee.salary
-- FROM Department  JOIN Employee  ON Employee.departmentId=Department.id 
-- WHERE(departmentId, salary) IN
-- (SELECT departmentId,MAX(salary) FROM Employee GROUP BY departmentId) ;

WITH max_sal AS (
    SELECT *,
        RANK() OVER(PARTITION BY departmentId ORDER BY salary DESC)
        AS rn
    FROM Employee
)

SELECT 
    d.name AS Department,
    max_sal.name AS Employee,
    max_sal.salary AS Salary
FROM max_sal
JOIN Department d
ON d.id = max_sal.departmentId
WHERE rn = 1;
