@java.lang.Override
public com.hazelcast.jet.Job newJob(com.hazelcast.jet.DAG dag, com.hazelcast.jet.config.JobConfig config) {
    com.hazelcast.jet.impl.JetClientInstanceImpl.JobImpl job = new com.hazelcast.jet.impl.JetClientInstanceImpl.JobImpl(dag, config);
    job.init();
    return job;
}