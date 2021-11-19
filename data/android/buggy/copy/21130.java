@org.junit.Before
public void initRuleEngine() {
    java.util.Map<java.lang.String, java.lang.Object> globals = new java.util.HashMap<java.lang.String, java.lang.Object>(1);
    this.engine = new org.jboss.jbossset.bugclerk.RuleEngine(globals);
}