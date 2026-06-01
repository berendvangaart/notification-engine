package io.github.berendvangaart.notification_engine.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Data
@Entity
@Table(name = "channel_mapping")
public class ChannelMapping {
    @Id
    @Column(name = "mapping_id")
    private String mappingId;
    private String eventType;

    @Enumerated(EnumType.STRING)
    private ChannelType channelType;
    private String destination;
    private boolean enabled;
    private Instant createdAt;
    private Instant updatedAt;
}