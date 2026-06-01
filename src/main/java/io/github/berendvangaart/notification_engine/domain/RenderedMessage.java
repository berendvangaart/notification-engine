package io.github.berendvangaart.notification_engine.domain;

import lombok.Data;

@Data
public class RenderedMessage {
    private String subject;
    private String body;
}
