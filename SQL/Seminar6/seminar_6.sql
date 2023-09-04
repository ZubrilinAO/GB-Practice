
CREATE TABLE users_old LIKE users;

DELIMITER //
CREATE PROCEDURE move_user_to_users_old (IN user_id INT)
BEGIN
  DECLARE EXIT HANDLER FOR SQLEXCEPTION
  BEGIN
    ROLLBACK;
    SELECT 'Error, user not moved' AS message;
  END;
  START TRANSACTION;
  INSERT INTO users_old SELECT * FROM users WHERE id = user_id;
  DELETE FROM users WHERE id = user_id;
  COMMIT;
  SELECT 'User moved to users_old' AS message;
END //
DELIMITER ;

CALL move_user_to_users_old(2);




DROP FUNCTION IF EXISTS hello;
DELIMITER //
CREATE FUNCTION hello()
RETURNS VARCHAR(50)
DETERMINISTIC
BEGIN
    DECLARE current_hour INT;
    DECLARE greeting VARCHAR(50);
    
    SET current_hour = HOUR(NOW());
    
    CASE
        WHEN current_hour >= 6 AND current_hour < 12 THEN
            SET greeting = 'Доброе утро';
        WHEN current_hour >= 12 AND current_hour < 18 THEN
            SET greeting = 'Добрый день';
        WHEN current_hour >= 18 AND current_hour < 24 THEN
            SET greeting = 'Добрый вечер';
        ELSE
            SET greeting = 'Доброй ночи';
    END CASE;
    
    RETURN greeting;
END //
DELIMITER ;

 SELECT CURTIME() AS 'time', hello() AS message;
