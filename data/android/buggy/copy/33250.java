public org.backmeup.index.sharing.policy.SharingPolicy createAndAddSharingPolicy(org.backmeup.index.model.User owner, org.backmeup.index.model.User sharingWith, org.backmeup.index.sharing.policy.SharingPolicies policy) {
    org.backmeup.index.sharing.policy.SharingPolicy shPolicy = new org.backmeup.index.sharing.policy.SharingPolicy(owner, sharingWith, policy);
    return addSharingPolicy(shPolicy);
}