public static void main(java.lang.String[] args) {
    SchoolNavigator.ServiceRunner.server = new SchoolNavigator.Server(1234);
    new java.lang.Thread(SchoolNavigator.ServiceRunner.server);
}