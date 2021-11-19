@Test
public void save_savesIntoDatabase_true() {
    myMovie.save();
    assertTrue(Movie.all().get(0).equals(mMovie));
}