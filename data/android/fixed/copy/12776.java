@java.lang.Override
public boolean canView(org.scijava.display.Display<?> display) {
    return supportedClass.isAssignableFrom(display.getClass());
}