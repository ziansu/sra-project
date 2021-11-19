@org.junit.Before
public void setUp() throws java.lang.Exception {
    java.lang.String path = edu.pugetsound.mathcs.nlp.controller.Controller.getBasePath(java.lang.System.getProperty("user.dir"), java.lang.System.getProperty("file.separator"));
    analyzer = new edu.pugetsound.mathcs.nlp.features.TextAnalyzer(path);
    conversation = new edu.pugetsound.mathcs.nlp.lang.Conversation();
}