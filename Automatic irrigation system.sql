create database irrigation_system;
Use  irrigation_system;

insert into details(water_amount , area , crop) values ('100 m^3' , '250 m^2' , 'watermelon');
insert into details(water_amount , area , crop) values ('100 m^3' , '250 m^2' , 'orange');
insert into details(water_amount , area , crop) values ('100 m^3' , '250 m^2' , 'pepper');

select * from details;





/** please note that I use ddlauto in springboot properties.file so table will be created automatically
/** if you do not need to use ddlauto I write instructions of how to create a table in READ.MD ;

