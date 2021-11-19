public org.eclipse.swt.graphics.Image getControlImage(int index) {
    if (IS_LINUX_OS) {
        return compImage[(index - 1)];
    }else {
        return null;
    }
}