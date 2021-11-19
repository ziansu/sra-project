@org.junit.Test
public void test() {
    java.util.List<messages.MESSAGE> docPlan = new java.util.ArrayList<>();
    java.util.List<simplenlg.framework.NLGElement> microPlan = this.microplanner.microPlan(docPlan);
    org.junit.Assert.assertNotNull(microPlan);
}