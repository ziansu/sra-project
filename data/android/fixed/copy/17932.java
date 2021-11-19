@org.junit.Test
public void searchMultiElementPresentUneven() {
    assertEquals(1, chop.search(3, new int[]{ 1 , 3 , 5 }));
}