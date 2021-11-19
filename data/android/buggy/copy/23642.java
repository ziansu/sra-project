@java.lang.Override
protected boolean register(org.opendaylight.vtn.manager.internal.VTNManagerImpl mgr) throws org.opendaylight.vtn.manager.VTNException {
    return register(mgr, this, new org.opendaylight.vtn.manager.internal.cluster.MacMapImpl.UpdateDeniedContext());
}