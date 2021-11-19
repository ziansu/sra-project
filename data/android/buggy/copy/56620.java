private java.lang.String sendRequestToAdminClient(java.lang.String request) throws org.apache.ofbiz.base.start.StartupException {
    java.util.List<org.apache.ofbiz.base.start.StartupCommand> startupCommands = org.apache.ofbiz.base.start.StartupCommandUtil.parseOfbizCommands(new java.lang.String[]{ request });
    org.apache.ofbiz.base.start.Config config = new org.apache.ofbiz.base.start.Config(startupCommands);
    return org.apache.ofbiz.base.start.AdminClient.requestStatus(config);
}