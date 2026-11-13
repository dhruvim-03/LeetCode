/* Write your T-SQL query statement below */


WITH ranked_salary AS (
SELECT
	E.name AS Employee,
    E.salary AS Salary,
    D.name AS Department
    ,
    -- Dense rank because Joe and Randy have the same salary.
    -- We need Will's actual rank not the skipped rank that is why Dense rank is used.
    DENSE_RANK() OVER(partition by D.id ORDER BY salary DESC) 'Rank_Salary'
FROM
	Employee E
INNER JOIN
	Department D ON E.departmentId = D.id
)
SELECT
	 Department,
     Employee,
     Salary
FROM
	ranked_salary
WHERE
	Rank_Salary < 4