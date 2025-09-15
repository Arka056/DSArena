-- # Write your MySQL query statement below
-- SELECT p.product_name, sum(o.unit) unit
-- from Products p
-- join Orders o using
-- on p.product_id = o.product_id
-- where o.order_date between '2020-02-01' and '2020-02-29' 
-- group by p.product_name
-- having sum(o.unit)>= 100;

























select p.product_name, sum(o.unit) unit
from Products p join Orders o on p.product_id = o.product_id
where o.order_date between '2020-02-01' and '2020-02-29'
group by p.product_name having unit >=100;









