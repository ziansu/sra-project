@org.junit.Test
public void testVCardFullN() {
    com.google.zxing.client.result.AddressBookParsedResultTestCase.doTest("BEGIN:VCARD\r\nVERSION:2.1\r\nN:Owen;Sean;T;Mr.;Esq.\r\nEND:VCARD", null, new java.lang.String[]{ "Mr. Sean T Owen Esq." }, null, null, null, null, null, null, null, null);
}