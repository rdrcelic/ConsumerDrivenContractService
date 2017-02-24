# ConsumerDrivenContractService
Playground for CDC.

Creating one microservice is cool - integrating and orchestrating microservices might turn to nightmare.
Consumer Driven Contracts might be a solution. I want to try it out and here is my work in progress.

I base this adventure on [Spring Rest Docs](http://docs.spring.io/spring-restdocs/docs/current/reference/html5/) with a plan to involve [Spring Cloud Contract](https://cloud.spring.io/spring-cloud-contract/spring-cloud-contract.html).
All development is TDD, so it might happen that code has test but no real implementation yet.
This is actually the point in CDC - based on tests and contracts both consumer (client) and provider 
 (server) are always in sync. So, if my test (read contract) has something that is not yet implemented
 test is going to fail - time to implement it.

