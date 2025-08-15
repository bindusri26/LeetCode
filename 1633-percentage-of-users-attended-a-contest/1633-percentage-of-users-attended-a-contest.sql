# Write your MySQL query statement below
SELECT contest_id,ROUND(COUNT(DISTINCT user_id)*100/total.total_users,2) AS percentage
FROM Register
CROSS JOIN(SELECT COUNT(*) AS total_users FROM Users)total
GROUP BY contest_id
ORDER BY percentage DESC,contest_id ASC