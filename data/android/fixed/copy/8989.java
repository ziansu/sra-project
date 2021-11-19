@org.junit.Test
public void testConstructorExecutesOkIfTableNameSpecified() {
    com.buabook.kdb.data.KdbTable table = new com.buabook.kdb.data.KdbTable("my-test-table");
    org.junit.Assert.assertThat(table, is(not(nullValue())));
}