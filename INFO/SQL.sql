
CREATE TABLE clients (
    id serial PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    phone VARCHAR(255) NOT NULL
);

INSERT INTO clients (first_name, last_name, phone)
VALUES
    ('John', 'Doe', '123-456-7890'),
    ('Jane', 'Smith', '987-654-3210'),
    ('Alice', 'Johnson', '555-123-4567');