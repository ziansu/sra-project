@org.junit.Test
public void getPages_Stream_Same_Thread() throws java.lang.Exception {
    java.util.stream.Stream<java.lang.Thread> pages = mapper.getPages(1);
    pages.forEach(( p) -> assertEquals(p.getId().intValue(), 215183));
}