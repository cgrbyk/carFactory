### Car Factory

Produce car if type exist.

#### rest example

> curl "0.0.0.0:8080/api/produceCar?carType=Sedan"  
"Sedan Car has produced"

> curl "0.0.0.0:8080/api/produceCar?carType=x"  
> Car type x not found.