@java.lang.Override
protected com.badlogic.gdx.backends.iosrobovm.IOSApplication createApplication() {
    com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration config = new com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration();
    com.araceinspace.MonetizationSubSystem.DummyController controller = new com.araceinspace.MonetizationSubSystem.DummyController();
    return new com.badlogic.gdx.backends.iosrobovm.IOSApplication(new com.araceinspace.ARaceInSpace(controller, null), config);
}