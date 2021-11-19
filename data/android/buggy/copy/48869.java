public static org.bugkillers.pattern.singleton.HighEfficiencyThreadSafeLazyloadedSingleton getInstance() {
    if ((org.bugkillers.pattern.singleton.HighEfficiencyThreadSafeLazyloadedSingleton.instance) != null) {
        synchronized(org.bugkillers.pattern.singleton.HighEfficiencyThreadSafeLazyloadedSingleton.class) {
            org.bugkillers.pattern.singleton.HighEfficiencyThreadSafeLazyloadedSingleton.instance = new org.bugkillers.pattern.singleton.HighEfficiencyThreadSafeLazyloadedSingleton();
        }
    }
    return org.bugkillers.pattern.singleton.HighEfficiencyThreadSafeLazyloadedSingleton.instance;
}