@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void registeringSameUniquePathShouldThrowAnException() throws java.lang.Exception {
    new org.apache.james.jmap.json.MultipleObjectMapperBuilder().registerClass("/other", org.apache.james.jmap.json.MultipleObjectMapperTest.First.class).registerClass("/other", org.apache.james.jmap.json.MultipleObjectMapperTest.Second.class).build();
}