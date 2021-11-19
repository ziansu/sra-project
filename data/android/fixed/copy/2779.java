public void run() {
    try {
        java_ojs.Main.update_articles_intersect(current_issue, java_ojs.Main.encoding);
    } catch (java.lang.IllegalStateException | java.io.IOException e1) {
        e1.printStackTrace();
    }
}