use semimar_4;

SELECT COUNT(*) 
FROM likes
JOIN profiles ON likes.user_id = profiles.user_id
WHERE profiles.birthday > DATE_SUB(CURRENT_DATE(), INTERVAL 12 YEAR);


SELECT 
IF (
    (SELECT COUNT(*) FROM likes JOIN profiles ON likes.user_id = profiles.user_id WHERE profiles.gender = 'm') > 
    (SELECT COUNT(*) FROM likes JOIN profiles ON likes.user_id = profiles.user_id WHERE profiles.gender = 'f'),
    'male',
    'female'
) AS "win";


SELECT * FROM users
WHERE id NOT IN (
    SELECT DISTINCT from_user_id
    FROM messages
);


