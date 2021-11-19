private org.apache.ofbiz.base.start.Config sendRequestToAdminClient(java.lang.String request) throws org.apache.ofbiz.base.start.StartupException {
    java.util.List<org.apache.ofbiz.base.start.StartupCommand> startupCommands = org.apache.ofbiz.base.start.StartupCommandUtil.parseOfbizCommands(new java.lang.String[]{ request });
    return new org.apache.ofbiz.base.start.Config(startupCommands);
}