public void run() {
    try {
        converter.ConverterUI frame = new converter.ConverterUI(uc);
        frame.setVisible(true);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}