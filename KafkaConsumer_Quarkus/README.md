# Kafka Streaming Application with Quarkus

This project is a simple example of a Kafka consumer application built using the Quarkus framework.

## Blog Details

This repository is accompanied by a blog post that provides a detailed explanation of the Kafka producer and demonstrates how to use it effectively. The blog post covers the following topics:

- Consumer groups: Multiple consumers can work together to process messages from different Kafka partitions.
- Partition assignment strategies: Messages are distributed evenly among consumers, ensuring load balancing and maximizing throughput.
- Polling: Consumers periodically request messages from Kafka brokers, providing flexibility and control over message consumption rate.
- Commit strategies: Different commit strategies, such as manual commits and automatic commits, enable message reliability and fault tolerance.
- Quarkus integration: The application utilizes the lightweight and fast Quarkus framework for building reactive and scalable Kafka consumer applications.


You can read the full blog post [here](https://medium.com/@yashashreechopada/real-time-data-processing-made-easy-with-kafka-consumer-api-c038c0a72374).

## To use this Kafka consumer application, follow these steps:

1. Start your Kafka cluster and create the necessary topic(s).
2. Run the Kafka consumer application.
3. Monitor the application logs to see the consumed messages and the processing output.


## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```



