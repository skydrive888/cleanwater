GRANT ALL PRIVILEGES ON DATABASE *.* TO postgres;
CREATE DATABASE cleanwater;
CREATE USER root WITH ENCRYPTED PASSWORD 'qwer1234';
GRANT ALL PRIVILEGES ON DATABASE cleanwater TO root;