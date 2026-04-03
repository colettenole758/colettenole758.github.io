-- ENHANCEMENT: Encapsulated Logic View (Outcome 4)
CREATE VIEW GetReturnStatistics AS
SELECT 
    Collaborators.Name AS Vendor,
    Orders.Description AS Product,
    RMA.Reason,
    RMA.Status
FROM Collaborators 
INNER JOIN Orders ON Collaborators.CollaboratorID = Orders.CollaboratorID 
INNER JOIN RMA ON Orders.OrderID = RMA.OrderID;

-- ENHANCEMENT: Defensive Data Pulls (Outcome 5)
CREATE VIEW SecureRMAReview AS
SELECT RMAID, Reason, Status 
FROM RMA 
WHERE Status = 'COMPLETE';