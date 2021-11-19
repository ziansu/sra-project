public void run() {
    try {
        java_ojs.Main.update_articles_intersect(current_issue, java_ojs.Main.encoding);
        java_ojs.Main.sync_authors_intersect(issue_id, java_ojs.Main.encoding, false);
    } catch (java.lang.IllegalStateException | java.io.IOException e1) {
        e1.printStackTrace();
    }
}