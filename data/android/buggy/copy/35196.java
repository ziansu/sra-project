@cern.c2mon.daq.config.Bean
public cern.c2mon.daq.common.messaging.JmsSender proxyJmsSender() {
    cern.c2mon.daq.common.messaging.impl.ProxyJmsSender proxyJmsSender = new cern.c2mon.daq.common.messaging.impl.ProxyJmsSender();
    proxyJmsSender.setWrappedSender(secondActiveJmsSender());
    return proxyJmsSender;
}