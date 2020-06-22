update TEST_USERS set FIRST_NAME = '' where FIRST_NAME is null ;
alter table TEST_USERS alter column FIRST_NAME set not null ;
update TEST_USERS set LAST_NAME = '' where LAST_NAME is null ;
alter table TEST_USERS alter column LAST_NAME set not null ;
-- update TEST_USERS set INN = <default_value> where INN is null ;
alter table TEST_USERS alter column INN set not null ;
