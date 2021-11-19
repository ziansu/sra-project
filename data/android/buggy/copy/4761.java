public void updateControlImage(org.eclipse.swt.graphics.Image image, int index) {
    if (IS_LINUX_OS) {
        compImage[(index - 1)] = image;
    }
}