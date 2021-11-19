@cucumber.api.java.en.Given(value = "^get the contents of local file from \"(.*?)\" where the filename begins \"(.*?)\"$")
public void Get_the_contents_of_local_file_from_where_the_filename_begins(java.lang.String location, java.lang.String fileName) throws java.lang.Throwable {
    fileContent = new java.io.File(((location + "/") + fileName));
    org.junit.Assert.assertTrue("file does not exist: ", fileContent.exists());
}