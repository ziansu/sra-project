@org.junit.Test
public void TestIsSource() {
    org.junit.Assert.assertEquals(gmail.henryzhefeng.Utils.StringUtil.isSource(gmail.henryzhefeng.Tests.StringUtilTest.STRING_SOURCE), true);
    org.junit.Assert.assertEquals(gmail.henryzhefeng.Utils.StringUtil.isSource(gmail.henryzhefeng.Tests.StringUtilTest.STRING_SINK), false);
}