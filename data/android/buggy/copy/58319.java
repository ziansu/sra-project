@org.testng.annotations.Test
public void testNegationEvaluateNotMarkedWithNotMarked() {
    pl.otros.logview.accept.query.org.apache.log4j.rule.Rule rule = pl.otros.logview.accept.query.org.apache.log4j.rule.MarkEqualsRule.getRule("false", true);
    boolean evaluate = rule.evaluate(ldNotMarked, new java.util.HashMap<>());
    org.testng.AssertJUnit.assertTrue(evaluate);
}