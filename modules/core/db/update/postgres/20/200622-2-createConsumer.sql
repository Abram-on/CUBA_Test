alter table TEST_CONSUMER add constraint FK_TEST_CONSUMER_ON_METER foreign key (METER_ID) references TEST_METER(ID);
create unique index IDX_TEST_CONSUMER_UK_METER_ID on TEST_CONSUMER (METER_ID) where DELETE_TS is null ;
create index IDX_TEST_CONSUMER_ON_METER on TEST_CONSUMER (METER_ID);
