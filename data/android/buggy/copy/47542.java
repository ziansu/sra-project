@java.lang.Override
@org.testng.annotations.Test
public void testRender() {
    wicketTester.startComponentInPage(new de.flower.rmt.ui.common.form.FormFeedbackPanel());
    wicketTester.dumpComponentWithPage();
    wicketTester.assertInvisible("hasErrors");
}