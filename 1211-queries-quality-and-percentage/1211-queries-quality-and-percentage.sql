# Write your MySQL query statement below
select query_name,
    round(AVG(rating/position),2) as quality,
    round(AVG(IF(rating < 3,1,0)) * 100, 2) as poor_query_percentage
from Queries
where query_name is not null
group by query_name;