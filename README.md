# CompareServiceArchitectures
This Java project provides an example which compares an example of orchestrated service architecture to choreographed service architecture in a single Java application. This project is purposefully simple and therefore hopefully easy and clear to read, but also certainly contrived.

# When it comes to services, what is orchestration? What is choreography?
Glad you asked. For a great explanation, check out the top response on [this SO question](https://stackoverflow.com/questions/29117570/orchestrating-microservices) which quotes Building Microservice by Sam Newman. 

# Please explain this project at a high-level
Sure, can do. 

## Explanation of the choreography architecture
In this example, there are 3 services: **service1**, **service2**, and **service3**. These services are "subscribed" to the **ChoreographEvent** object using Listeners, a common tool for enabling the "observer pattern" in Java. These listeners add themselves to the arrayList of ChoreographEvents they would like to listen for. The **ChoreographEvent** triggers these services by calling **ohShitWaddup()**, which launches an ExecutorService to send requests to each service that is listening for this method. Each of those services responds by emitting "Here come dat boi!", "Ennui", and "Existential Depression", respectively.

## Explanation of the orchestration architecture

These same 3 services are also added to an ArrayList within an **OrchestrationBrain** object. The **OrchestrationBrain**, upon calling the **ohShitWaddup** method, iterates through the list of service objects and executes their start method on individual threads using an ExecutorService. 

--- 

The **TestEachServiceType** class contains the main method from which you can run both examples. It runs the choreograph example, then print a new line, then runs the orchestrated example. 
