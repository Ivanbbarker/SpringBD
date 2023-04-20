
    create table bicicleta (
       id bigint not null auto_increment,
        cliente varchar(255),
        marca varchar(255),
        modelo varchar(255),
        primary key (id)
    ) engine=InnoDB;
