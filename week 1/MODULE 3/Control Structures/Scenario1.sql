BEGIN
FOR c IN(
    SELECT CustomerId
    FROM Customers
    WHERE TRUNC(MONTHS_BETWEEN(SYSDATE, DOB)/12) > 60
    )
    
    LOOP
     UPDATE Loans
     SET  InterestRate=InterestRate-1
     WHERE CustomerId=c.CustomerId;
    END LOOP;

    COMMIT;
END;
/