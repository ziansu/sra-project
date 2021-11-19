@org.junit.Test
public void testParseSketchEntryGetsRightColour() throws java.lang.Exception {
    java.lang.String simpleText = "red 0 0";
    org.hwyl.sexytopo.model.sketch.PathDetail pathDetail = org.hwyl.sexytopo.control.io.thirdparty.xvi.XviImporter.parseSketchEntry(simpleText);
    junit.framework.Assert.assertEquals(Colour.RED, pathDetail.getColour());
}