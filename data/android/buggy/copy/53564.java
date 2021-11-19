@org.junit.Test(expected = java.lang.IndexOutOfBoundsException.class)
public void testgetSingleElement_WithoutInput() {
    int expectedSize = 0;
    org.junit.Assert.assertEquals("The size of the Collection list should be 1. Else it should throw an error", expectedSize, edu.ucdenver.ccp.common.collections.CollectionsUtil.getSingleElement(edu.ucdenver.ccp.common.collections.CollectionsUtil.createList()));
}