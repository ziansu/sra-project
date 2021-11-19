@org.springframework.context.annotation.Bean
public org.atlasapi.remotesite.amazonunbox.AmazonUnboxHttpFeedSupplier amazonUnboxFeedSupplier() {
    return new org.atlasapi.remotesite.amazonunbox.AmazonUnboxHttpFeedSupplier(unboxUrl);
}