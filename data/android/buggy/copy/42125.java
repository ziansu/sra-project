@org.junit.Test
public void recordMethodWithJustADeclarationInABlock() {
    {
        java.lang.String inner = "inner";
        org.junit.Assert.assertThat(hu.advancedweb.scott.helper.TestHelper.getLastRecordedStateFor("inner"), org.hamcrest.CoreMatchers.equalTo(inner));
    }
}