private boolean isVpcOfferingRedundantRouter(java.util.Map serviceCapabilitystList) {
    return this.findCapabilityForService(serviceCapabilitystList, Capability.RedundantRouter, Service.SourceNat);
}