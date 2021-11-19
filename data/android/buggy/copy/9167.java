@org.junit.Test
@com.github.springtestdbunit.annotation.DatabaseSetup
public void testGet() throws java.lang.Exception {
    com.yeahmobi.ut_sample.entity.Person person = personMapper.selectByPrimaryKey(1);
    org.junit.Assert.assertEquals("name1", person.getName());
}