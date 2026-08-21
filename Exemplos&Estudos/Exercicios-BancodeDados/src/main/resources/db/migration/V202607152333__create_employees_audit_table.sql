CREATE TABLE employees_audit(
    id BIGINT not null auto_increment,
    employee_id  BIGINT NOT NULL,
    name VARCHAR (150) not null,
    old_name VARCHAR (150) null,
    salary decimal(10,2) not null,
    old_salary decimal(10,2) null,
    birthday TIMESTAMP not null,
    old_birthday TIMESTAMP null,
    operation CHAR(1),
    create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)

)engine=InnoDB default charset=utf8;
