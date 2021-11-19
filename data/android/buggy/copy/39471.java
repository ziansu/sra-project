public void run() {
    try {
        ca.yorku.cse2311.tab2pdf.ui.MainJFrame.createAndShow("Tab2PDF", arguments);
    } catch (java.lang.Exception e) {
        ca.yorku.cse2311.tab2pdf.Main.LOG.severe(e.getMessage());
    }
}