@org.junit.Test(expected = org.openremote.controller.exception.XMLParsingException.class)
public void testGetGestureforInvalidGesture() throws java.lang.Exception {
    org.jdom.Element controlElement = deployer.queryElementById(9);
    org.openremote.controller.component.control.gesture.Gesture g = ((org.openremote.controller.component.control.gesture.Gesture) (builder.build(controlElement, "test")));
}