@org.junit.Test
public void nameEmptyTest() {
    expected.expect(java.lang.IllegalArgumentException.class);
    cz.muni.fi.pb138.odskart.backend.Movie movie = new cz.muni.fi.pb138.odskart.backend.Movie("");
}