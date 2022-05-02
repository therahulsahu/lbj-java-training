This application will run on localhost:8081

Terminals: 
- /appointment        - AppointmentController
- /contact            - ContactController

Connect to postgres: 
1. See the application.properties file
2. Make a Database in Postgre Sql

JSON POST Requset for /appointment syntax : 
```
{
    "customer" : {
        "name": "rahul",
        "age" : 22,
        "mobileNumber" : "987654321",
        "emailId" : "rahul@gmail.com",
        "address": {
            "addressLine1": "fe",
            "city": "",
            "country" : "",
            "pincode": ""
        },
        "selectedPackage": {
            "name": "ONETIME",
            "amount": 500 
        }
    },
    "trainerPreference": "MALE",
    "needPysiohotherapist": true
}
```
Inside selectedPackage, name is Enum and only accepts :(ONETIME, FOURSESSIONS, FIVESESSIONS)

JSON POST request for /contact syntax : 
```
{
    "name": "rahul",
    "message": "hello word",
    "email": "rahul@gmail.com",
    "phoneNumber": 987654321
}
```
