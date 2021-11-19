@org.junit.Test
public void recordMethodWithJustADeclarationInABlock() {
    {
        java.lang.String inner = "inner";
        assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("inner"), org.hamcrest.CoreMatchers.equalTo(inner));
    }
}