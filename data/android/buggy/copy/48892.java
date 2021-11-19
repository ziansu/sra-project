public void saveTPointConfig() {
    try {
        TPointConfig.save(newConfig_tpoint);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}