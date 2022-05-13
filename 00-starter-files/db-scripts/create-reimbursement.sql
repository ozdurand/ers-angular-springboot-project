-- -----------------------------------------------------
-- Schema full-stack-ersapp
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `dev`;

CREATE SCHEMA `dev`;
USE `dev` ;

-- -----------------------------------------------------
-- Add sample data
-- -----------------------------------------------------

INSERT INTO employee(username, password, firstname, lastname, is_manager ) VALUES ('jdurand@gmail.com', 'naruto26', 'Jaleel',
																					'Durand', false);
                                                                                    
INSERT INTO employee(username, password, firstname, lastname, is_manager ) VALUES ('anai5311@gmail.com', 'memyselfandI72', 'Anaiah',
																					'Durand', false);
INSERT INTO employee(username, password, firstname, lastname, is_manager ) VALUES ('odurand@gmail.com', 'laughinglike1999', 'Oswald',
																					'Durand', true);

INSERT INTO reimbursement (description, amount, date_created, status, employee_id)
VALUES ('Spring Framework Seminar', 1265 , '2022-05-01', 'Approved', 3);

INSERT INTO reimbursement (description, amount, date_created, status, employee_id)
VALUES ('Spring Boot Udemy Course', 14.95 , '2022-04-15', 'Approved', 2);

INSERT INTO reimbursement (description, amount, date_created, status, employee_id)
VALUES ('Oracle Conference 2022', 1550 , '2022-02-11', 'Approved', 3);

INSERT INTO reimbursement (description, amount, date_created, status, employee_id)
VALUES ('DevOps Refresher course', 125 , '2021-08-21', 'Approved', 3);

INSERT INTO reimbursement (description, amount, date_created, status, employee_id)
VALUES ('Business Trip/Flights', 2500 , '2021-01-30', 'Approved', 1);

INSERT INTO reimbursement (description, amount, date_created, status, employee_id)
VALUES ('Business Lunch with Client', 265.85 , '2021-01-15', 'Approved', 3);

INSERT INTO reimbursement (description, amount, date_created, status, employee_id)
VALUES ('Haagen Dasz Ice Cream ', 5.45 , '2020-08-21', 'Denied', 1);



