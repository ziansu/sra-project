@org.springframework.context.annotation.Bean
public com.kryptnostic.conductor.rpc.ConductorSparkApi api() throws java.io.IOException, java.net.UnknownHostException {
    com.kryptnostic.conductor.rpc.ConductorSparkApi api = new com.kryptnostic.sparks.ConductorSparkImpl(com.dataloom.edm.internal.DatastoreConstants.KEYSPACE, sparkSession, sparkContextJavaFunctions(), dataModelService(), hazelcastInstance, elasticsearchApi());
    return api;
}