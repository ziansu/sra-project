@org.junit.Test
public void shouldListOptionCorrectly() throws java.lang.Exception {
    org.junit.Assert.assertEquals(("Please select an option :\n" + ((("\t[1]: List books\n" + "\t[2]: Check out Book\n") + "\t[3]: Return book\n") + "\t[4]: Quit\n")), app.getOptionList());
}