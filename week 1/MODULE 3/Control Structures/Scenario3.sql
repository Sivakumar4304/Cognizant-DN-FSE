BEGIN
    FOR l IN (
        SELECT CustomerId, LoanId, EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )

    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ' || l.LoanId ||
            ' is due on ' || l.EndDate
        );
    END LOOP;

END;
/