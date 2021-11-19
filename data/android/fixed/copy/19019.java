@org.junit.Test
@com.yeahmobi.yunit.annotation.DatabaseSetup
@com.yeahmobi.yunit.annotation.ExpectedDatabase
public void testDelete() throws java.lang.Exception {
    this.personMapper.deleteByPrimaryKey(2);
}