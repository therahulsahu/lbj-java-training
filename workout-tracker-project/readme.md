
## Endpoint for 'post request' to save workout
- http://localhost:8081/workout

```
{
    "title": "running",
    "note": "do this for 15 minutes",
    "caloriesBurntPerMinute": 550.98,
    "category": "RUNNING"
}
```
category is a enum and can only accept : (RUNNING, YOGA, CYCLING, LIFTING)

## Endpoint for 'get request' to get all workout
- http://localhost:8081/workout

## Endpoint to search by id 
- http://localhost:8081/workout/id?id={PUT_ID_HERE}

## Endpoint for delete by id, use delete request here
- http://localhost:8081/workout/delete?id={PUT_ID_HERE}

## Endpoint for updating workout, use put request here
- http://localhost:8081/workout/update?id={PUT_ID_HERE}
- body
```
{
        "id": 2,
        "title": "dancing",
        "note": "do this for 14 minutes",
        "caloriesBurntPerMinute": 550.98,
        "category": "RUNNING"
}
```

