@java.lang.Override
public void initializeGoApplicationAccessor(com.thoughtworks.go.plugin.api.GoApplicationAccessor goApplicationAccessor) {
    this.goApplicationAccessor = goApplicationAccessor;
    this.handlers = componentFactory.handlers();
}