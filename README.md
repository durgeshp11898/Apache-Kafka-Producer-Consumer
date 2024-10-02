Kafka Setup and CLI Commands
This README provides the steps to create Kafka topics, start producer and consumer apps using the Kafka command-line interface (CLI), and use an HTTP endpoint for publishing messages.

Prerequisites
Kafka and Zookeeper installed and running.
Access to the Kafka binaries (kafka-topics.sh, kafka-console-producer.sh, kafka-console-consumer.sh).
Zookeeper available at zookeeper:2181.
Kafka broker running at localhost:9092.
Steps
1. Create Kafka Topic
To create a Kafka topic, use the following command:


kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic quickstart

--replication-factor: Sets the replication factor of the topic. A replication factor of 1 means no redundancy.
--partitions: Number of partitions for the topic.


2. Start Producer App (CLI)
To start producing messages to the quickstart topic, run the following command:

bash
Copy code
kafka-console-producer.sh --topic quickstart --bootstrap-server localhost:9092
This command opens a terminal where you can input messages to be sent to the topic.

3. Start Consumer App (CLI)
To consume messages from the quickstart topic, run the following command:

bash
Copy code
kafka-console-consumer.sh --topic quickstart --from-beginning --bootstrap-server localhost:9092
This command reads and displays all messages from the beginning of the topic.

4. Create Kafka Topic with Multiple Partitions
To create another topic demo1 with 3 partitions, use the following command:

bash
Copy code
kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 3 --topic demo1
5. Start Producer App for demo1
To start producing messages to the demo1 topic, run the following:


kafka-console-producer.sh --topic demo1 --bootstrap-server localhost:9092
6. Start Consumer App for demo1
To consume messages from the demo1 topic, run:


kafka-console-consumer.sh --topic demo1 --from-beginning --bootstrap-server localhost:9092
7. HTTP API for Producing Messages
You can also produce messages via an HTTP API. Send a message to the producer app running on localhost:8082 by accessing the following URL:


http://localhost:8082/producer-app/publish/Welcome
This will publish the message "Welcome" to the Kafka topic via the producer app.

Ensure that all services (Zookeeper, Kafka broker, producer, and consumer apps) are running correctly for the above commands to work.




