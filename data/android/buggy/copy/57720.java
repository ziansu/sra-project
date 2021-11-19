@java.lang.SuppressWarnings(value = { "unused" , "resource" })
public void connectWithClientPolicy() throws com.aerospike.client.AerospikeException {
    com.aerospike.client.policy.ClientPolicy clientPolicy = new com.aerospike.client.policy.ClientPolicy();
    clientPolicy.maxThreads = 200;
    clientPolicy.maxSocketIdle = 3;
    com.aerospike.client.AerospikeClient client = new com.aerospike.client.AerospikeClient(clientPolicy, "a.host", 3000);
}