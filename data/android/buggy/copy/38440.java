public static void setBroker(final org.opendaylight.controller.md.sal.binding.api.DataBroker broker) {
    org.opendaylight.netvirt.bgpmanager.BgpUtil.dataBroker = broker;
    org.opendaylight.netvirt.bgpmanager.BgpUtil.initTransactionChain();
}