@org.testng.annotations.Test
public void testEvaluateMarkedWithNotMarked() {
    pl.otros.logview.accept.query.org.apache.log4j.rule.Rule rule = pl.otros.logview.accept.query.org.apache.log4j.rule.MarkEqualsRule.getRule("true");
    boolean evaluate = rule.evaluate(ldNotMarked, new java.util.HashMap<>());
    org.testng.AssertJUnit.assertFalse(evaluate);
}