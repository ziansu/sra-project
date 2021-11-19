@org.junit.Test
public void testAddQuoteForSpecialChar_Order3() throws java.lang.Exception {
    org.mockito.Mockito.when(conn.getMetadataTable()).thenReturn(createMetadataTable(new java.lang.String[]{ "都市名" , "国(コード)" , "国(コード)123" , "国" , "abc$1234" , "abc$1234xyz" }));
    testMore();
}