package org.kafkaconsumer;



import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.common.TopicPartition;
import org.eclipse.microprofile.reactive.messaging.Incoming;


public class KafkaConsumerResource {

    @Incoming("data-input")
    public void consumeRecords(ConsumerRecords<String, Integer> records) {
        for (TopicPartition partition : records.partitions()) {
            for (ConsumerRecord<String, Integer> record : records.records(partition)) {
                System.out.println("Product Name: " + record.value());
                System.out.println("Quantity: " + record.key());
                System.out.println("Partition Number: "+ record.partition());
                System.out.println("Topic Name: "+record.topic());
            }
        }
    }
}