@java.lang.Override
public void initialize(java.util.Map<java.lang.String, com.linkedpipes.etl.executor.api.v1.dataunit.DataUnit> dataUnits, com.linkedpipes.etl.executor.api.v1.impl.Context context) throws com.linkedpipes.etl.executor.api.v1.impl.InitializationFailed {
    this.context = context;
    bindPorts(dataUnits);
    injectObjects(context);
    loadConfigurations(getConfigurationDataUnit());
}