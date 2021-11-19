@org.junit.Before
public void setUp() throws java.lang.Exception {
    controller = new wewoAPI.CommentsController(new mockRepositories.MockCommentsRepository());
    context = new ContextTest("Boris");
    mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    out = new java.io.ByteArrayOutputStream();
}