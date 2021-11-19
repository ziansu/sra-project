@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> getComponentConfiguration() {
    return org.apache.storm.utils.TupleUtils.putTickFrequencyIntoComponentConfig(super.getComponentConfiguration(), flushIntervalInSeconds);
}