alter table TEST_USERS add constraint FK_TEST_USERS_ON_USER foreign key (USER_ID) references TEST_CONSUMER(ID);
create index IDX_TEST_USERS_ON_USER on TEST_USERS (USER_ID);
