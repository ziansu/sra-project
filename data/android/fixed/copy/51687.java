@org.junit.Test
public void findByAbbreviation() throws java.lang.Throwable {
    org.junit.Assert.assertEquals(EngGrammarUpperType.NOUN, com.trimc.blogger.commons.type.adapter.EngGrammarUpperTypeAdapter.findByAbbreviation("n."));
}