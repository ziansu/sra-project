public java.util.Map<java.lang.String, java.lang.String> getAddresses() throws java.lang.Exception {
    return new com.hazelcast.aws.impl.DescribeInstances(awsConfig).execute(endpoint);
}