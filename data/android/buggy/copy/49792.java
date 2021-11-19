@org.junit.Test
@com.github.springtestdbunit.annotation.DatabaseSetup
@com.github.springtestdbunit.annotation.ExpectedDatabase
public void testInsert() throws java.lang.Exception {
    com.yeahmobi.ut_sample.entity.Person person = new com.yeahmobi.ut_sample.entity.Person();
    person.setId(3);
    person.setName("name3");
    person.setGender("f");
    personMapper.insert(person);
}