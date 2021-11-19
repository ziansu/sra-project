public void refresh() {
    try {
        builds = client.getRecentBuilds();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}