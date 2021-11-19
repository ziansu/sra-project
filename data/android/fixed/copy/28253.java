public io.github.tcdl.msb.api.message.MetaMessage build() {
    publishedAt = clock.instant();
    java.lang.Long durationMs = java.time.Duration.between(this.createdAt, publishedAt).toMillis();
    return new io.github.tcdl.msb.api.message.MetaMessage(ttl, createdAt, publishedAt, durationMs, serviceDetails);
}