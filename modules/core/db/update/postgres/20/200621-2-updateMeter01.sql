alter table TEST_METER add constraint FK_TEST_METER_ON_USER foreign key (USER_ID) references TEST_USERS(ID);
create index IDX_TEST_METER_ON_USER on TEST_METER (USER_ID);
