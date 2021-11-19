private boolean matchesForRecursion(com.evolveum.midpoint.xml.ns._public.common.common_3.OrgType thisOrg) {
    for (java.lang.String recurseUpOrgType : evaluatorType.getRecurseUpOrgType()) {
        thisOrg.getOrgType().contains(recurseUpOrgType);
        return true;
    }
    return false;
}