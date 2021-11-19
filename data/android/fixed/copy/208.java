@org.junit.BeforeClass
public static void initialize() {
    moviescraper.doctord.SiteParsingProfile.test.OnePondoParsingProfileTest.profile = new moviescraper.doctord.SiteParsingProfile.specific.OnePondoParsingProfile();
    java.lang.String searchString = moviescraper.doctord.SiteParsingProfile.test.OnePondoParsingProfileTest.profile.createSearchString(moviescraper.doctord.SiteParsingProfile.test.OnePondoParsingProfileTest.file);
    java.lang.System.out.println(searchString);
    org.jsoup.nodes.Document document = moviescraper.doctord.controller.SpecificScraperAction.downloadDocument(searchString);
    moviescraper.doctord.SiteParsingProfile.test.OnePondoParsingProfileTest.profile.setDocument(document);
}