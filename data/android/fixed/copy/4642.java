public void addComponent(final java.lang.String componentId, final stroom.dashboard.client.main.ResultComponent resultComponent) {
    final java.util.Map<java.lang.String, stroom.dashboard.client.main.ResultComponent> componentMap = new java.util.HashMap(this.componentMap);
    componentMap.put(componentId, resultComponent);
    this.componentMap = componentMap;
}