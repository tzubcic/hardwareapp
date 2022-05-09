create table if not exists hardware(
    id identity,
    hardware_name varchar(40) not null,
    code varchar(40) not null,
    price decimal not null,
    hardware_type varchar(40) not null,
    quantity_available integer not null
    );


create table if not exists review(
    id identity,
    title varchar(40) not null,
    text varchar(256) not null,
    grade varchar(20) not null,
    hardware_id integer not null,
    primary key (id),
    foreign key (hardware_id) references hardware(id)
);
