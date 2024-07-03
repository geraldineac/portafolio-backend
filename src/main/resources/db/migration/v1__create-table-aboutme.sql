create table aboutme (

    id bigint not null auto_increment,
    photo varchar(255),
    full_name varchar(100) not null,
    about_me varchar(255),
    email varchar(100) not null,
    phone varchar(20),
    ubication varchar(100),
    linkedin_profile varchar(255),
    github_profile varchar(255),
    resume varchar(255),

    primary key(id)

);