use semimar_4;

CREATE VIEW users_under_20 AS
SELECT u.firstname, u.lastname, p.hometown, p.gender
FROM users u
JOIN profiles p ON u.id = p.user_id
WHERE TIMESTAMPDIFF(YEAR, p.birthday, CURDATE()) <= 20;


SELECT
  u.FirstName,
  u.LastName,
  COUNT(m.id) AS MessageCount,
  DENSE_RANK() OVER (ORDER BY COUNT(m.id) DESC) AS Ranking
FROM
  users u
  JOIN messages m ON u.id = m.from_user_id
GROUP BY
  u.id
ORDER BY
  Ranking;
  
  
  SELECT
    id,
    created_at,
    LAG(created_at) OVER (ORDER BY created_at) AS previous_created_at,
    TIMESTAMPDIFF(MINUTE, LAG(created_at) OVER (ORDER BY created_at), created_at) AS time_difference
FROM
    messages
ORDER BY
    created_at;
