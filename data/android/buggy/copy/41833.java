private void processNeutronSecurityRuleDeleted(org.opendaylight.ovsdb.openstack.netvirt.translator.NeutronSecurityRule neutronSecurityRule) {
    java.util.List<org.opendaylight.ovsdb.openstack.netvirt.translator.NeutronPort> portList = getPortWithSecurityGroup(neutronSecurityRule.getSecurityRuleGroupID());
    for (org.opendaylight.ovsdb.openstack.netvirt.translator.NeutronPort port : portList) {
        syncSecurityGroup(neutronSecurityRule, port, neutronSecurityRule.getSecurityRuleGroupID(), false);
    }
}