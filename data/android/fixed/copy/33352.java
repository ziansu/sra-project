@java.lang.Override
public org.eclipse.swt.graphics.Image getControlImage(final int index) {
    if (IS_LINUX_OS) {
        return compImage[(index - 1)];
    }else {
        return null;
    }
}