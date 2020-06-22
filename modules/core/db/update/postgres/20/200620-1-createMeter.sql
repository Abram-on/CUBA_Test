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
    CURRENT_INDICATION integer,
    IS_USED boolean not null,
    --
    primary key (ID)
);