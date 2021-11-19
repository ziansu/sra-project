public void request(org.epics.pvdata.pv.PVStructure pvArgument, org.epics.pvaClient.PvaClientRPCRequester pvaClientRPCRequester) {
    checkRPCState();
    this.pvaClientRPCRequester = pvaClientRPCRequester;
    channelRPC.request(pvArgument);
}