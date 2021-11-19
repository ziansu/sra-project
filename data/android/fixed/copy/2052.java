public static void main(java.lang.String[] args) {
    try {
        voldemort.restclient.admin.CoordinatorAdminCommand.executeCommand(args);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        java.lang.System.exit(1);
    }
    java.lang.System.exit(0);
}