@org.junit.Test
public void shouldReturnEmptyCollectionIfSearchWordIsBlank() {
    java.lang.String string = "Ismail Emre Kartoglu. Ismai Emre. Ismal. My name is Is mail.";
    java.util.List<java.lang.String> strings = uk.ac.kcl.iop.brc.core.pipeline.common.utils.StringTools.getApproximatelyMatchingStringList(string, "");
    org.springframework.test.util.MatcherAssertionErrors.assertThat(strings.size(), org.hamcrest.CoreMatchers.equalTo(0));
}