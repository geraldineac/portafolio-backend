create table project(

    id bigint not null auto_increment,
    name varchar(100) not null,
    description varchar(100) not null,
    url varchar(100) not null,

    primary key(id)

);