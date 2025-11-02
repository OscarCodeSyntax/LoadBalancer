# LoadBalancer

This is a challenge to understand how loadBalancers work at a basic level.
https://codingchallenges.fyi/challenges/challenge-load-balancer

(Kafka, nginx and spring cloud LoadBalancer do it best)

Articles used:
https://www.technoidentity.com/insights/load-balancer-in-java-simple-lb/ 
Logic doesn't seem to count requests or take that into account...
How are they getting the output? The selector always returns server 1 as it's got a load of 10....

- Add max load value.
- Add current req count value.
- Weighted round Robin.
- Multithreading added.
