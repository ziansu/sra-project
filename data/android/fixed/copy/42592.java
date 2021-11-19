public static void checkProblem(java.lang.String question, double score, mcquizer.model.interfaces.IProblem actual) {
    org.junit.Assert.assertEquals(question, actual.getQuestion());
    org.junit.Assert.assertEquals(score, actual.getWeight(), (score / 100000));
}