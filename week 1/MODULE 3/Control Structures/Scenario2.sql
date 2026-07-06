 BEGIN
 FOR c IN(
    SELECT CustomerId
    FROM Customers
    WHERE Balance>10000
 )

 LOOP
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE CustomerId=c.CustomerId;
 END LOOP;

 COMMIT;
END;
/    
