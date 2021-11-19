public static int getManagementPort(java.lang.String url) {
    return org.apache.cloudstack.storage.datastore.utils.DateraUtil.getPort(org.apache.cloudstack.storage.datastore.utils.DateraUtil.MANAGEMENT_IP, url, org.apache.cloudstack.storage.datastore.utils.DateraUtil.DEFAULT_MANAGEMENT_PORT);
}