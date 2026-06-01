package io.github.berendvangaart.notification_engine.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "template")
public class Template {

    @Id
    @Column(name = "template_id")
    private String templateId;

    @Column(name = "event_type")
    private String eventType;

    @Enumerated(EnumType.STRING)
    @Column(name = "channel_type")
    private ChannelType channelType;

    @Column(name = "subject_pattern")
    private String subjectPattern;

    @Column(name = "body_pattern")
    private String bodyPattern;
}

