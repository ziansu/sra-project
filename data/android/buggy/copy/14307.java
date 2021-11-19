public void run() {
    try {
        GUI window = new GUI("Project allocation data.tsv");
        window.frame.setVisible(true);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}