@org.junit.Test
public void test_001() throws java.lang.Exception {
    org.animotron.expression.Expression.__(new org.animotron.expression.AnimoExpression("the a x z."));
    assertAnimoResult(new org.animotron.expression.AnimoExpression("all x"), "z.");
}