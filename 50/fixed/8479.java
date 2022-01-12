@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testBuildNullArg() throws java.lang.Exception {
    org.openremote.controller.component.control.gesture.Gesture g = ((org.openremote.controller.component.control.gesture.Gesture) (builder.build(null, "test")));
}