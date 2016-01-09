
select
===
select * from user where 1=1
@if(!isEmpty(phone)){
and phone = #phone#
@}          
@if(!isEmpty(uname)){
and uname = #uname#
@}