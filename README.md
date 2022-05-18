``` 
cd /Users/coderprabhu/eclipse-workspace/cassandra-spring

cqlsh -f queries/createandloadstoredb.cql

cqlsh> SELECT * FROM store.shopping_cart;

 userid | item_count | last_update_timestamp
--------+------------+---------------------------------
   1234 |          5 | 2022-05-18 07:14:17.219000+0000
   9876 |          2 | 2022-05-18 07:14:17.206000+0000

(2 rows)

cqlsh>  INSERT INTO store.shopping_cart (userid, item_count) VALUES ('4567', 20);
cqlsh> SELECT * FROM store.shopping_cart;

 userid | item_count | last_update_timestamp
--------+------------+---------------------------------
   4567 |         20 |                            null
   1234 |          5 | 2022-05-18 07:14:17.219000+0000
   9876 |          2 | 2022-05-18 07:14:17.206000+0000

(3 rows)
cqlsh> 


``` 