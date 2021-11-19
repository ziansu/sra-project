public static void main(java.lang.String[] args) {
    com.cninfo.meyes.client.common.ClientProperties config = com.cninfo.meyes.client.common.ClientProperties.getSingleton();
    java.lang.System.out.println(config.get("download.url"));
}