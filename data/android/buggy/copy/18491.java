@org.junit.Before
public void init() throws java.lang.Exception {
    java.lang.System.out.println(("Setting up ...: " + (generateTestData().toString())));
    java.lang.System.out.println(airports);
    dp = new innopolis.project.e4.providers.CsvDataProvider(generateTestData().toString());
}