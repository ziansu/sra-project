private boolean deleteFlowCond(java.lang.String condName) {
    org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.RemoveFlowConditionInput input = new org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.RemoveFlowConditionInputBuilder().setName(condName).build();
    boolean status = vtnManangerService.unsetFlowCond(input);
    return status;
}