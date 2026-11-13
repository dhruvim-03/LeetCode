-- SELECT Department.name AS Department ,Employee.name AS Employee, Employee.salary
-- FROM Department  JOIN Employee  ON Employee.departmentId=Department.id 
-- WHERE(departmentId, salary) IN
-- (SELECT departmentId,MAX(salary) FROM Employee GROUP BY departmentId) ;

WITH cte AS (
    SELECT *,
        RANK() OVER(PARTITION BY departmentId ORDER BY salary DESC)
        AS rn
    FROM Employee
)

SELECT 
    d.name AS Department,
    cte.name AS Employee,
    cte.salary AS Salary
FROM cte
JOIN Department d
ON d.id = cte.departmentId
WHERE rn = 1;
