@java.lang.Override
public java.util.Set<org.osc.sdk.manager.element.ManagerPolicyElement> getManagerPolicyElements() {
    java.util.Set<org.osc.sdk.manager.element.ManagerPolicyElement> managerPolicyElements = new java.util.HashSet<>();
    for (com.paloaltonetworks.osc.model.Policy policy : this.policies) {
        managerPolicyElements.add(policy);
    }
    return managerPolicyElements;
}