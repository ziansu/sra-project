@org.junit.Test
public void test1() {
    org.credential.finder.analyzer.FileAnalyzer.findIssues("src/test/resources/example.file").forEach(java.lang.System.out::println);
}