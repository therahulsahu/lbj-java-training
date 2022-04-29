# JSON syntax for saving order

orderStatus is of type Enum, accepted values : ( PLACED , SHIPPED ,CLOSED, CANCELLED, REJECTED, RETURED, REPLACED )
```
{
        "orderId": 1,
        "customerId": 101,
        "orderAmount": 500,
        "orderStatus": "PLACED",
        "storeName": "storename 1",
        "customerName": "customername 1",
        "customerEmail": "cust@gmail.com"
}
```

# To search by order id:
- localhost:8081/order/get?id={PUT_ID_HERE}

# To search by customer id:
- localhost:8081/order/customerId?id={PUT_ID_HERE}

