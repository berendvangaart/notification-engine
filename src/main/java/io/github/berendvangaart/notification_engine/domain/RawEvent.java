package io.github.berendvangaart.notification_engine.domain;

import lombok.Data;

import java.util.Map;

@Data
public class RawEvent {
    private String eventId;
    private String eventType;
    private String source;
    private Map<String, Object> payload;
}
