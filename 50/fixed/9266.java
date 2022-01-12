@org.junit.Test
public void findPathRunLog() throws java.io.IOException {
    final java.net.URL testPath = com.google.common.io.Resources.getResource(com.hartwig.healthchecks.common.io.path.PathRegexFinderTest.TEST_DIR);
    final java.nio.file.Path path = com.hartwig.healthchecks.common.io.path.PathRegexFinder.build().findPath(testPath.getPath(), com.hartwig.healthchecks.common.io.path.PathRegexFinderTest.TEST_DIR);
    org.junit.Assert.assertNotNull(com.hartwig.healthchecks.common.io.path.PathRegexFinderTest.NOT_NULL, path);
}