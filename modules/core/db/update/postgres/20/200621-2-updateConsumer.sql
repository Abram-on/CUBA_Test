alter table TEST_CONSUMER rename column meter_id to meter_id__u41066 ;
alter table TEST_CONSUMER alter column meter_id__u41066 drop not null ;
alter table TEST_CONSUMER rename column user_id to user_id__u12799 ;
alter table TEST_CONSUMER alter column user_id__u12799 drop not null ;
alter table TEST_CONSUMER add column STREET_NAME varchar(255) ^
update TEST_CONSUMER set STREET_NAME = '' where STREET_NAME is null ;
alter table TEST_CONSUMER alter column STREET_NAME set not null ;
alter table TEST_CONSUMER add column HOUSE_NUM integer ;
alter table TEST_CONSUMER add column APPARTMENT_NUM integer ;
alter table TEST_CONSUMER add column METER_ID uuid ;
