@java.lang.Override
public void setPolicyUsed(org.wso2.carbon.device.mgt.common.DeviceIdentifier deviceIdentifier, org.wso2.carbon.policy.mgt.common.Policy policy) throws org.wso2.carbon.policy.mgt.common.PolicyManagementException {
    policyManager.addAppliedPolicyToDevice(deviceIdentifier, policy);
}