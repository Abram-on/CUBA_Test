-- begin TEST_USERS
create unique index IDX_TEST_USERS_UK_INN on TEST_USERS (INN) where DELETE_TS is null ^
-- end TEST_USERS
-- begin TEST_METER
alter table TEST_METER add constraint FK_TEST_METER_ON_USER foreign key (USER_ID) references TEST_USERS(ID)^
create unique index IDX_TEST_METER_UK_SERIAL_NUM on TEST_METER (SERIAL_NUM) where DELETE_TS is null ^
create index IDX_TEST_METER_ON_USER on TEST_METER (USER_ID)^
-- end TEST_METER
-- begin TEST_CONSUMER
alter table TEST_CONSUMER add constraint FK_TEST_CONSUMER_ON_METER foreign key (METER_ID) references TEST_METER(ID)^
create unique index IDX_TEST_CONSUMER_UK_METER_ID on TEST_CONSUMER (METER_ID) where DELETE_TS is null ^
create index IDX_TEST_CONSUMER_ON_METER on TEST_CONSUMER (METER_ID)^
-- end TEST_CONSUMER
