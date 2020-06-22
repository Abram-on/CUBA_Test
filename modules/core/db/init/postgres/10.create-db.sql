-- begin TEST_USERS
create table TEST_USERS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    INN varchar(255) not null,
    --
    primary key (ID)
)^
-- end TEST_USERS
-- begin TEST_METER
create table TEST_METER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SERIAL_NUM varchar(50) not null,
    USER_ID uuid,
    CURRENT_INDICATION integer,
    IS_USED false,
    --
    primary key (ID)
)^
-- end TEST_METER
-- begin TEST_CONSUMER
create table TEST_CONSUMER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    METER_ID uuid,
    STREET_NAME varchar(255) not null,
    HOUSE_NUM varchar(3) not null,
    APARTMENT_NUM varchar(3) not null,
    --
    primary key (ID)
)^
-- end TEST_CONSUMER
