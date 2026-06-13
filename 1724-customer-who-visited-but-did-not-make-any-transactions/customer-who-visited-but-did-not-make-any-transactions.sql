# Write your MySQL query statement below
select customer_id ,COUNT(V.visit_id ) AS count_no_trans from Visits V  LEFT join Transactions T
 on V.visit_id =T.visit_id 
WHERE T.transaction_id IS NULL 
GROUP BY V.customer_id ;