package io.github.berendvangaart.notification_engine.domain;

import lombok.Data;

import java.time.Instant;

@Data
public class DispatchJob {
    private String jobId;
    private String eventId;
    private ChannelType channelType;
    private String destination;
    private RenderedMessage message;
    private int AttemptCount;
    private Instant createdAt;
}
