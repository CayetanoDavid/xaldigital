CREATE TABLE xal_digital_empleado 
(
    empleado_id SERIAL PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    company_name VARCHAR(80),
    address_emp VARCHAR(80),
    city VARCHAR(30),
    state_emp VARCHAR(5) CHECK (length(state_emp) = 2),
    zip VARCHAR(10),
    phone1 VARCHAR(30),	
    phone2 VARCHAR(30),	
    email VARCHAR(40),	
    department VARCHAR(40)
);