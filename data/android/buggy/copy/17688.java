@org.junit.Test
public void testPositive() {
    tester.getApplication().getComponentPostOnBeforeRenderListeners().add(checker);
    tester.startComponentInPage(new org.apache.wicket.devutils.stateless.StatelessCheckerTest.StatelessLabel("foo"));
}