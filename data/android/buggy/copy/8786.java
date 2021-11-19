@java.lang.Override
public java.util.List<com.axon.bank.dao.entity.ApplicantEntity> getLoanApplicants() {
    java.lang.System.out.println("Not implimented");
    java.util.List<com.axon.bank.dao.entity.ApplicantEntity> applicantEntityList = ((java.util.List<com.axon.bank.dao.entity.ApplicantEntity>) (super.getHibernateTemplate().find("from ApplicantEntity")));
    return applicantEntityList;
}