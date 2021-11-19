@java.lang.Override
public void terminateInstance(org.apache.stratos.cloud.controller.iaases.kubernetes.MemberContext memberContext) throws org.apache.stratos.cloud.controller.iaases.kubernetes.InvalidCartridgeTypeException, org.apache.stratos.cloud.controller.iaases.kubernetes.InvalidMemberException, org.apache.stratos.cloud.controller.iaases.kubernetes.MemberTerminationFailedException {
    terminateContainer(memberContext);
}