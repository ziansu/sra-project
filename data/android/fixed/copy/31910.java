@java.lang.Override
public java.lang.Object[] getImplementations() {
    org.opendaylight.vtn.manager.integrationtest.internal.Activator.LOG.debug("openflow stub activator getImplementations called.");
    java.lang.Object[] res = new java.lang.Object[]{ org.opendaylight.vtn.manager.integrationtest.internal.ReadService.class , org.opendaylight.vtn.manager.integrationtest.internal.InventoryService.class , org.opendaylight.vtn.manager.integrationtest.internal.TopologyServices.class , org.opendaylight.vtn.manager.integrationtest.internal.DataPacketServices.class };
    return res;
}