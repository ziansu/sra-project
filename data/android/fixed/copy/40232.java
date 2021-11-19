public static org.opendaylight.ipsec.domain.IPsecRule get(int position) {
    if (position >= (org.opendaylight.ipsec.buffer.IPsecRuleBuffer.rules.size())) {
        return null;
    }else {
        return org.opendaylight.ipsec.buffer.IPsecRuleBuffer.rules.get(position);
    }
}