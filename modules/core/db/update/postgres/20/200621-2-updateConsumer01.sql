alter table TEST_CONSUMER add constraint FK_TEST_CONSUMER_ON_METER foreign key (METER_ID) references TEST_METER(ID);
create index IDX_TEST_CONSUMER_ON_METER on TEST_CONSUMER (METER_ID);
