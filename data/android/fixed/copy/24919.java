public com.redhat.lightblue.client.LightblueClientConfiguration getLightblueClientConfiguration() {
    com.redhat.lightblue.client.LightblueClientConfiguration lbConf = new com.redhat.lightblue.client.LightblueClientConfiguration();
    lbConf.setUseCertAuth(false);
    lbConf.setDataServiceURI(getDataUrl());
    lbConf.setMetadataServiceURI(getMetadataUrl());
    return lbConf;
}