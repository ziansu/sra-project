@org.testng.annotations.Test
public void testNegationEvaluateColorPostive() {
    pl.otros.logview.accept.query.org.apache.log4j.rule.Rule rule = pl.otros.logview.accept.query.org.apache.log4j.rule.MarkEqualsRule.getRule(MarkerColors.Black.toString(), true);
    boolean evaluate = rule.evaluate(ldBlack, new java.util.HashMap<>());
    org.testng.AssertJUnit.assertTrue(evaluate);
}