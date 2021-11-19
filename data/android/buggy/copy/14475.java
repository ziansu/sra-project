@org.testng.annotations.Test
public void testNegationEvaluateColorNegative() {
    pl.otros.logview.accept.query.org.apache.log4j.rule.Rule rule = pl.otros.logview.accept.query.org.apache.log4j.rule.MarkEqualsRule.getRule("brown", true);
    boolean evaluate = rule.evaluate(ldBlack, new java.util.HashMap<>());
    org.testng.AssertJUnit.assertFalse(evaluate);
}