@java.lang.Override
protected java.util.List<org.apache.nifi.components.PropertyDescriptor> getSupportedPropertyDescriptors() {
    final java.util.List<org.apache.nifi.components.PropertyDescriptor> props = new java.util.ArrayList(properties);
    props.add(org.apache.nifi.processors.hadoop.FetchHDFS.FILENAME);
    return props;
}