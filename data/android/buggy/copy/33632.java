public void run() {
    if (current != null) {
        if ((com.codename1.impl.ios.IOSImplementation.instance.currentEditing) != null) {
            com.codename1.impl.ios.IOSImplementation.instance.currentEditing.requestFocus();
        }
        current.revalidate();
    }
}