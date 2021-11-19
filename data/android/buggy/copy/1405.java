@java.lang.Override
public java.util.Optional<com.msm.aggregation.intercept.config.Configuration> findConfiguration(java.lang.String url) {
    try {
        return java.util.Optional.ofNullable(cache.get(url));
    } catch (java.util.concurrent.ExecutionException e) {
        e.printStackTrace();
    }
    return java.util.Optional.empty();
}