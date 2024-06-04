create database users;
use users;

create table registration(Name varchar(50), RegNo int, Mobile int, Username varchar(50), Password varchar(100), PRIMARY KEY (Username));
desc registration;
select * from registration;

use users;
create table login_authentication(Username varchar(100), Passsword varchar(100), PRIMARY KEY (Username));
desc login_authentication;

select * from login_authentication;

