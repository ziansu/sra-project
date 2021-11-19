@org.junit.Test
public void testGetGestureforInvalidGesture() throws java.lang.Exception {
    org.jdom.Element controlElement = deployer.queryElementById(9);
    org.openremote.controller.component.control.gesture.Gesture g = ((org.openremote.controller.component.control.gesture.Gesture) (builder.build(controlElement, "test")));
    junit.framework.Assert.assertNull("Expected null gesture (or exception) when building with wrong XML content", g);
}