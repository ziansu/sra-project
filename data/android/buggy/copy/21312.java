public static boolean testFunctors() {
    org.apache.jmeter.protocol.http.gui.HTTPFileArgsPanel instance = new org.apache.jmeter.protocol.http.gui.HTTPFileArgsPanel("");
    instance.initializeTableModel();
    return instance.tableModel.checkFunctors(null, instance.getClass());
}