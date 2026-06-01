package io.github.berendvangaart.notification_engine.domain;

import lombok.Data;

import java.time.Instant;
import java.util.Map;

@Data
public class InternalEvent {
    private String eventId;
    private String eventType;
    private String source;
    private Map<String, Object> payload;
    private Instant receivedAt;
}
