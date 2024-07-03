create table educations(

    id bigint not null auto_increment,
    company varchar(100) not null,
    contract_start varchar(10) not null,
    contract_end varchar(10) not null,
    position varchar(100) not null,
    description varchar(255) not null,

    primary key(id)

);