alter table TEST_USERS rename column user_id to user_id__u03712 ;
alter table TEST_USERS drop constraint FK_TEST_USERS_ON_USER ;
drop index IDX_TEST_USERS_ON_USER ;
