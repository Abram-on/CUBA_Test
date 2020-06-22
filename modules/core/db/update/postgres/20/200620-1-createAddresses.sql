create table TEST_ADDRESSES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STREET_NAME varchar(255) not null,
    HOUSE_NUM integer not null,
    APPARTMENT_NUM integer not null,
    --
    primary key (ID)
);