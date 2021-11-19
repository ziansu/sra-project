@org.junit.Test
public void getTargetLanguages() throws java.lang.Exception {
    java.util.List<org.unfoldingword.door43client.objects.TargetLanguage> languages = org.unfoldingword.door43client.LibraryGettersUnitTest.library.getTargetLanguages();
    org.junit.Assert.assertEquals(languages.size(), 4);
}