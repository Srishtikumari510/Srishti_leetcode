# Write your MySQL query statement below
SELECT w.id FROM Weather w
JOIN Weather w1 ON 
DATEDIFF(w.recordDate ,w1.recordDate)=1
where w.temperature > w1.temperature;
