drop schema if exists GroupFourProject;
create schema GroupFourProject;

use GroupFourProject;
CREATE TABLE Airline
(
	airline_name VARCHAR(50) PRIMARY KEY,
    num_employees INT,
    num_gates INT,
    num_airplane INT
);
CREATE TABLE Airplane
(
    airplane_ID INT PRIMARY KEY,
    airline_name VARCHAR(50),
    capacity INT,
    model VARCHAR(50),
    FOREIGN KEY (airline_name) REFERENCES Airline(airline_name)
);
CREATE TABLE Flight
(
	flight_num INT PRIMARY KEY,
	depart_time TIME,
    arrival_time TIME,
    airplane_ID INT,
    staff VARCHAR(50),
    FOREIGN KEY (airplane_ID) REFERENCES Airplane(airplane_ID) 
);
CREATE TABLE Gate
(
	gate_ID INT PRIMARY KEY,
	flight_num INT,
    FOREIGN KEY (flight_num) REFERENCES Flight(flight_num) ON DELETE SET NULL
);
CREATE TABLE Employee
(
	employee_ID INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    flight_num INT,
    role VARCHAR(50),
    FOREIGN KEY (flight_num) REFERENCES Flight(flight_num) ON DELETE SET NULL
);

CREATE TABLE Ticket
(
	ticket_num INT PRIMARY KEY,
    flight_num INT,
    FOREIGN KEY (flight_num) REFERENCES Flight(flight_num) ON DELETE CASCADE
);

CREATE TABLE Passenger
(
	passenger_ID INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    ticket_num INT,
    num_bags INT,
    seat_num INT,
    checked_in BOOL,
    FOREIGN KEY (ticket_num) REFERENCES Ticket(ticket_num) ON DELETE CASCADE
);

INSERT INTO Airline (airline_name, num_employees, num_gates, num_airplane)
VALUES
	("Delta", 100, 10, 10),
    ("Spirit", 200, 15, 15),
    ("American Airlines", 75, 8, 10),
    ("Alaska Airlines", 30, 3, 5),
    ("United Airlines", 150, 20, 25);
    
    
INSERT INTO Airplane (airplane_ID, airline_name, capacity, model)
VALUES
	(0001, "Delta", 190, "Boeing 737"),
    (0010, "Spirit", 210, "Boeing 747"),
    (0002, "Delta", 210, "Boeing 747"),
    (0100, "American Airlines", 330, "Boeing 787"),
    (1000, "Alaska Airlines", 100, "Boeing 727");
    
INSERT INTO Flight (flight_num, depart_time, arrival_time, airplane_ID, staff)
VALUES
	(1, "08:00:00", "12:00:00", 1, 5),
    (2, "14:30:00", "16:30:00", 1000, 3),
    (3, "10:15:00", "19:00:00", 2, 7),
    (4, "6:00:00", "9:00:00", 3, 5),
    (5, "12:00:00", "17:00:00", 4, 6);
    
INSERT INTO Gate (gate_ID, flight_num)
VALUES
	(01, 1),
    (02, 2),
    (03, 3),
    (04, 4),
    (05, 5);

INSERT INTO Employee (employee_ID, first_name, last_name, flight_num, role)
VALUES
	(100101, "John", "Doe", 1, "Flight Attendent"),
    (000201, "Jane", "Doe", 5, "Pilot"),
    (102001, "Taylor", "Swift", 2, "Co-Pilot"),
    (00101, "Metro", "State", 4, "Flight Attendent"),
    (010101, "Satoru", "Gojo", 3, "Co-Pilot");

INSERT INTO Ticket(ticket_num, flight_num)
VALUES
	(1, 1),
    (2, 2),
    (3, 1),
    (4, 3),
    (5, 4);

INSERT INTO Passenger(passenger_ID, first_name, last_name, ticket_num, num_bags, seat_num, checked_in)
VALUES
	(12, 001, 2, 01, FALSE),
    (23, 002, 3, 01, TRUE),
    (32, 003, 2, 02, TRUE),
    (41, 004, 5, 01, FALSE),
    (51, 005, 3, 01, TRUE);


SELECT passenger_ID FROM Passenger WHERE checked_in = FALSE;

SELECT passenger_ID, ticket_num FROM Passenger WHERE num_bags > 2;

SELECT employee_ID, role, Flight.flight_num FROM Employee INNER JOIN Flight ON Employee.flight_num = Flight.Flight_num ORDER BY Flight.flight_num;

SELECT Flight.flight_num, Airplane.airline_name, Gate.gate_ID, Flight.depart_time, Flight.arrival_time FROM Airplane 
INNER JOIN Flight ON Airplane.airplane_ID = Flight.airplane_ID INNER JOIN Gate ON Flight.flight_num = Gate.flight_num ORDER BY depart_time;

SELECT Airplane.model, Airplane.capacity FROM Airplane ORDER BY capacity;
	(12, "John", "Doe", 001, 2, 01, FALSE),
    (23, "Jane", "Doe", 002, 3, 01, TRUE),
    (32, "League", "Legend", 003, 2, 02, TRUE),
    (41, "My", "Sql", 004, 5, 01, FALSE),
    (51, "Java", "Script", 005, 3, 01, TRUE);
    
    

