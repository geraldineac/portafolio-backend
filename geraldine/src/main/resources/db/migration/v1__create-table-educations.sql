create table educations(

    id bigint not null auto_increment,
    name varchar(100) not null,
    institution varchar(100) not null,
    year varchar(10) not null,
    description varchar(255) not null,

    primary key(id)

);