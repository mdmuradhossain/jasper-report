CREATE TABLE employees (
    employee_id  bigint NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(128) NOT NULL,
    last_name VARCHAR(128),
    email VARCHAR(128),
    phone_number VARCHAR(128),
    hire_date DATETIME,
    salary double,
    PRIMARY KEY (employee_id)
);