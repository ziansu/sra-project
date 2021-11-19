@java.lang.Override
public void connect() {
    this.checkHTTPClientInit(eventAdapterConfiguration.getStaticProperties());
    httpConnectionConfiguration = new org.wso2.carbon.device.mgt.output.adapter.http.util.HTTPConnectionConfiguration(eventAdapterConfiguration, globalProperties);
    generateToken();
}