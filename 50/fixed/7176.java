@javax.persistence.Transient
public java.lang.Boolean isSponsorReport(java.lang.String nciInstituteCode) {
    if (reportDefinition.getOrganization().getNciInstituteCode().equals(nciInstituteCode))
        return true;
    
    return false;
}