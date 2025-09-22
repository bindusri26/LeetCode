# Write your MySQL query statement below
SELECT IFNULL(
    (SELECT DISTINCT salary
FROM Employee
WHERE salary IS NOT NULL
ORDER BY salary DESC
LIMIT 1,1),NULL
)AS SecondHighestSalary;