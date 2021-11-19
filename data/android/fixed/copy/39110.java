@org.junit.Test
public void testDummyGood() {
    kfag.parse("15", false, new org.talend.dataquality.duplicating.RandomWrapper(542));
    output = kfag.generateMaskedRow(input);
    assertEquals(input, output);
}