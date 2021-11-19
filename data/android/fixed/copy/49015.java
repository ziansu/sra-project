@org.junit.Test
public void test2() {
    user.overrideJoystickPosition(4);
    controller.followSpeed();
    user.overrideJoystickPosition((-4));
    controller.followSpeed();
    org.junit.Assert.assertEquals(0, controller.getReferenceSpeed());
}