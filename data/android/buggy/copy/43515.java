@org.junit.Before
public void setUp() {
    activityTestRule = new android.support.test.rule.ActivityTestRule(com.nextzy.mrsmile.mvp_example.calculator.CalculatorActivity.class);
}