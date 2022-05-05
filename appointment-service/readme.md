This application will run on localhost:8081

Terminals: 
- /appointment        - AppointmentController
- /contact            - ContactController

Connect to postgres: 
1. See the application.properties file
2. Make a Database in Postgre Sql

## JSON POST Request for creating appointment, endpoint :  /appointment syntax : 
```
{
    "customer" : {
        "id": 9,
        "name": "rahul",
        "age" : 23,
        "mobileNumber" : "987654321",
        "emailId" : "rahul@email.com",
        "address": "bangalore",
        "packageName": "ONETIME",
        "amount": 500
    },
    "trainerPreference": "MALE",
    "needPysiohotherapist": false
}
```
packageName is Enum and only accepts :(ONETIME, FOURSESSIONS, FIVESESSIONS)

## Endpoint for getting appointments by email id:
```
http://localhost:8081/appointment/view/customer?email=nitesh@email.com
```

## To view all appointments
```
http://localhost:8081/appointment/view
```

## To delete by id
```
http://localhost:8081/appointment/delete?id=2
```
## To update, send a post request
```
http://localhost:8081/appointment/put
```
with body: 
```
{
    "id": 1,
    "customer": {
        "id": 9
    },
    "trainerPreference": "MALE"
}
```


JSON POST request for /contact syntax : 
```
{
    "name": "rahul",
    "message": "hello word",
    "email": "rahul@gmail.com",
    "phoneNumber": 987654321
}
```
