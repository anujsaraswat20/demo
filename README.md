"# SpringHibernateDemo" 

step 1: check post in "application.properties" file and change if required

step 2: fg
  run command : mvn clean install

step 3: 
  after successful compile, go to "target" folder and run "java -jar JAR_FILE_NAME""



-----------------------------------------------------------------------
To get all customer
URL : localhost:8080/customer/getall
RequestType = GET

Response:
[
    {
        "id": 1,
        "version": 0,
        "name": "test1",
        "age": "10",
        "designation": "manager"
    }
]

-----------------------------------------------------------------------
To create customer
URL : localhost:8080/customer/
RequestType = POST

JSON to create Customer:
{
	"name" : "test1",
	"age" : "10",
	"designation" : "manager"
}
-----------------------------------------------------------------------
Swagger API documenation is available at:
	http://localhost:8080/swagger-ui.html
	
-----------------------------------------------------------------------
To add trade:
URL : localhost:8080/demo/trades
RequestType = POST

JSON to create/add trade
{    "id": 14377, 
	"type": "sell",
	"user": {       "id": 6,       "name": "Waldo"    }, 
	"symbol": "ABG", 
	"shares": 12, 
	"price": 377.49, 
	"timestamp": "2015-02-06 12:47:35" 
	
}
-----------------------------------------------------------------------

To get trade:

URL : localhost:8080/demo/trades/
RequestType = GET

JSON response:
[
    {
        "id": 14377,
        "type": "sell",
        "user": {
            "id": 6,
            "name": "Waldo"
        },
        "symbol": "ABG",
        "shares": 12,
        "price": 377.49,
        "timestamp": "2015-02-06 12:47:35"
    }
]
	 