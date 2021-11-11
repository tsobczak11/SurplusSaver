/* Stored Procedures: */
CREATE PROCEDURE FarmCount(IN farmid SMALLINT UNSIGNED, OUT quantity INT)
	SELECT COUNT(*)
    INTO quantity
    FROM farm
    WHERE farm_id = farmid;
    
/* Functions: */
CREATE FUNCTION `CountOrders` (orderNum INT)
	RETURNS INTEGER
	READS SQL DATA
BEGIN

	DECLARE count INT;
    
    SELECT farm
    INTO count
    FROM orders
    WHERE order_id = order_id;
    
RETURN count;
END