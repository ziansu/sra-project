@org.junit.Test
@com.github.springtestdbunit.annotation.DatabaseSetup
@com.github.springtestdbunit.annotation.ExpectedDatabase
public void testDelete() throws java.lang.Exception {
    personMapper.deleteByPrimaryKey(2);
}