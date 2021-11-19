@org.junit.Test
public void testGetChunks() throws java.lang.Exception {
    context.healthinformatics.sequentialdataanalysis.Connections c = new context.healthinformatics.sequentialdataanalysis.Connections(chunks);
    org.junit.Assert.assertEquals(c.getChunkByLine(1, chunks), c1);
    org.junit.Assert.assertEquals(c.getChunkByLine(2, chunks), c3);
}