public java.util.List<org.opendaylight.neutron.spi.NeutronLoadBalancerPoolMember> getLoadBalancerPoolMembers() {
    for (org.opendaylight.neutron.spi.NeutronLoadBalancerPoolMember member : loadBalancerPoolMembers)
        member.setPoolID(loadBalancerPoolID);
    
    return loadBalancerPoolMembers;
}