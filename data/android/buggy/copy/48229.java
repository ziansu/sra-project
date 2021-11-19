@org.junit.BeforeClass
public static void setupAbstractTestPlan() {
    try {
        org.testah.framework.testPlan.AbstractTestPlan.testPlan = null;
    } catch (final java.lang.Exception e) {
    }
}