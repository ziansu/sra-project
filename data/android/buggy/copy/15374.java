@org.junit.Test
public void testRetrieval() throws java.lang.Exception {
    final com.sefford.kor.repositories.utils.TestElement element = prepareElementForRetrieval(0);
    assertThat(((com.sefford.kor.repositories.DiskJsonRepository) (repository)).get(0), org.hamcrest.core.Is.is(element));
}