@org.junit.Test
public void testAmountOfLinesReaderGivesCorrectResult() throws java.lang.Exception {
    org.group17.bubblebobble.MapReader mp = new org.group17.bubblebobble.MapReader();
    org.junit.Assert.assertEquals(org.group17.bubblebobble.TestMapReader.AMOUNT_OF_LINES_TEST_FILE, mp.amountOfLinesReader("testLevel.txt"));
}