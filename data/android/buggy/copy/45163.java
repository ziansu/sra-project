@java.lang.Override
public void afterPropertiesSet() throws java.lang.Exception {
    com.gemstone.gemfire.cache.RegionFactory<java.lang.String, org.springframework.cloud.stream.binder.gemfire.ConsumerGroupTracker> regionFactory = this.cache.createRegionFactory(RegionShortcut.REPLICATE);
    this.consumerGroupsRegion = regionFactory.setScope(Scope.GLOBAL).create(org.springframework.cloud.stream.binder.gemfire.GemfireMessageChannelBinder.CONSUMER_GROUPS_REGION);
}