@org.junit.Before
public void setup() throws java.io.IOException {
    instance = hazelcastFactory.newHazelcastInstance();
    hazelcastFactory.newHazelcastInstance();
    hazelcastFactory.newHazelcastInstance();
    client = hazelcastFactory.newHazelcastClient();
}