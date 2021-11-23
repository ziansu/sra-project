@org.junit.Test
public void getPages_Stream_No_Empty_Pages() throws java.lang.Exception {
    java.util.stream.Stream<java.lang.Thread> pages = mapper.getPages(1);
    pages.forEach(( p) -> assertNotEquals("0", p.getPosts().getCount()));
}