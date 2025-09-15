#Stored Procedure

/*A stored procedure is a set of Structured Query Language (SQL) statements with an 
assigned name, which are stored in a relational database management system (RDBMS) 
as a group, so it can be reused and shared by multiple programs.

Stored procedures can access or modify data in a database, but it is not tied to a 
specific database or object, which offers a number of advantages.
*/

-- Normally Queries are not saved
-- If you want to save any query on the database server for execution later, one way 
-- to do it is to use a stored procedure.

USE classicmodels;

SELECT 
    customerName, 
    city, 
    state, 
    postalCode, 
    country
FROM
    customers
ORDER BY customerName;

/*The following CREATE PROCEDURE statement creates a new stored procedure that 
 wraps the query above: */

-- Create Stored Procedure
DELIMITER $$
CREATE PROCEDURE getMyCustomers()
BEGIN 

SELECT 
	customerName,
	city,
	state,
	postalCode,
	country
	 FROM 
	 customers
	 ORDER BY customerName;
	 
	 END$$
	DELIMITER ;
	
	
	CALL getMyCustomers();
	
	SELECT *  FROM employees;
SELECT * FROM offices;

DELIMITER $$

CREATE PROCEDURE getMyEmployees()
BEGIN 

SELECT e.employeeNumber,CONCAT(lastName,' ',firstName),
		email, jobTitle, ofc.city,ofc.country
		 FROM employees e 
			INNER JOIN offices ofc
			ON e.officeCode=ofc.officeCode;


	 END$$
	DELIMITER ;
	

CALL getMyEmployees();


-- 
/* IN parameters
IN is the default mode. When you define an IN parameter in a stored procedure, 
the calling program has to pass an argument to the stored procedure.*/

-- stored procedure that finds all offices that locate in a country 
-- specified by the input parameter countryName:


DELIMITER //

CREATE PROCEDURE getOfficeByCountry(IN countryName VARCHAR(255))
BEGIN 

SELECT *
		 FROM offices 
			WHERE country = countryName ;

	 END //
	DELIMITER ;
	

CALL getOfficeByCountry('usa ');

CALL getOfficeByCountry('France ');

CALL getOfficeByCountry('');


/*OUT parameters
The value of an OUT parameter can be changed inside the stored procedure 
and its new value is passed back to the calling program.

Notice that the stored procedure cannot access the initial value of the 
OUT parameter when it starts.*/

-- stored procedure returns the number of orders by order status.
DELIMITER $$

CREATE PROCEDURE getOrderCountByStatus(IN orderStatus VARCHAR(25), OUT total INT )
BEGIN 

SELECT COUNT(orderNumber)
		INTO total
		 FROM orders
			WHERE status = orderStatus ;

	 END $$
	DELIMITER ;
CALL getOrderCountByStatus('Shipped', @total);
SELECT @total AS TotalShipped;

CALL getOrderCountByStatus('Cancelled',@total1);
SELECT @total1 AS TotalCancelled;

CALL getOrderCountByStatus('In Process',@total2);
SELECT @total1 AS TotalInProcess;

CALL getOrderCountByStatus('Disputed',@total3);
SELECT @total3 AS TotalDisputed;


-- The INOUT parameter
DELIMITER $$

CREATE PROCEDURE setCounter(
INOUT counter INT,
IN inc INT 
)
BEGIN 

SET counter = counter + inc;
	 END $$
	DELIMITER ;
SET @counter = 1;


CALL setCounter(@counter,1);
SELECT  @counter;
CALL setCounter(@counter,1);
SELECT  @counter;
CALL setCounter(@counter,5);
SELECT  @counter;

SHOW PROCEDURE STATUS;

SHOW PROCEDURE STATUS WHERE db = 'classicmodels';