/* Minimum 4 Simple Queries */
	/* Simple query using logic operators and ORDER BY clause */
CREATE VIEW transportView
AS SELECT order_id AS 'Order Number', shipment_date AS 'Date to Ship'
FROM transport
WHERE shipment_date > '2020-01-01'
AND shipment_date < '2021-01-01'
ORDER BY shipment_date ASC;
	/* Simple query using logic operators and ORDER BY clause */
    
    /* Simple query using logic operators and ORDER BY clause */
    
    /* Simple query using logic operators and ORDER BY clause */
    
    
/* Minimum 4 Aggregate Queries */
	/* Aggregate function using a numeric function */
CREATE VIEW farmCountView
AS SELECT COUNT(*) AS 'Number of Farms'
FROM farm;
	/* Aggregate function using a string function */
    
    /* Aggregate function using a date and time function */
    
    /* Aggregate function using a GROUP BY and HAVING clauses */
    
    
/* Minimum 4 Complex Queries */
	/* Complex query using any type of join */
CREATE VIEW orderNumDate
AS SELECT farm.order_id AS 'Order Number', transport.shipment_date AS 'Shipment Date'
FROM farm
INNER JOIN transport ON farm.order_id = transport.order_id;
	/* Complex query using any type of join */
    
	/* Complex query using a correlated subquery (without EXIST) */
    
    /* Complex query using a correlated subquery (using EXIST) */
    
    
/* INDEX statements for each table */
	/* INDEX statement for farm */
CREATE INDEX farmIndex
ON farm (order_id);
    /* INDEX statement for transport */
CREATE INDEX transportIndex
ON transport (shipment_date);
    /* INDEX statement for orders */
    
    
    /* INDEX statement for recipient */
    
    
    /* INDEX statement for available_surplus */
    
    
    /* INDEX statement for crop */
    
    
    /* INDEX statement for category */
    
    
    /* INDEX statement for quantity */
    
    
    /* INDEX statement for location */
    
    
    


