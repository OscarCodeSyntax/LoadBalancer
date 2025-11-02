# LoadBalancer

I am aware that kafka and spring cloud LoadBalancer are excellent.

This is a challenge to understand how they work at a basic level.


Info:

Acts like a simple point of contact that manages traffic.

Add and removes services based on loads?

Can re-direct to another healthy server if one fails/ becomes unhealthy.

Articles used:
https://www.technoidentity.com/insights/load-balancer-in-java-simple-lb/ 
Logic doesn't seem to count requests or take that into account...
How are they getting the output? The selector always returns server 1 as it's got a load of 10....

- Add max load value.
- Add current req count value.
- Weighted round Robin.