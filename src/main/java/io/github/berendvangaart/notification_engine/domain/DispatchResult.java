package io.github.berendvangaart.notification_engine.domain;

import lombok.Data;

@Data
public class DispatchResult {
    private boolean success;
    private boolean retryable;
    private String errorDetail;
}
