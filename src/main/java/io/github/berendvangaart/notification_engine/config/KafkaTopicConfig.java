package io.github.berendvangaart.notification_engine.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic intakeTopic() {
        return TopicBuilder.name("notifications.intake")
                .partitions(1)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic dispatchTopic() {
        return TopicBuilder.name("notifications.dispatch")
                .partitions(2)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic retryTopic() {
        return TopicBuilder.name("notifications.retry")
                .partitions(2)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic dlqTopic() {
        return TopicBuilder.name("notifications.dlq")
                .partitions(1)
                .replicas(1)
                .build();
    }

}
