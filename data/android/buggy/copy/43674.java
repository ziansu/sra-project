public void itemStateChanged(java.awt.event.ItemEvent ie) {
    com.codename1.impl.javase.JavaSEPort.useNativeInput = !(com.codename1.impl.javase.JavaSEPort.useNativeInput);
    if (com.codename1.impl.javase.JavaSEPort.useNativeInput) {
        com.codename1.ui.Display.getInstance().setDefaultVirtualKeyboard(null);
    }else {
        com.codename1.ui.Display.getInstance().setDefaultVirtualKeyboard(new com.codename1.ui.VirtualKeyboard());
    }
}