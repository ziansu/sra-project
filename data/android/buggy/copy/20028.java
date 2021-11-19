@org.junit.Test
public void invalidFileTest() throws java.io.IOException {
    java.lang.String csv = java.lang.String.join(java.lang.System.lineSeparator(), "", "A;B", "C");
    eu.itesla_project.commons.util.StringAnonymizer anonymizer = eu.itesla_project.commons.util.StringAnonymizerTest.fromCsv(csv);
    assertEquals(1, anonymizer.getStringCount());
}