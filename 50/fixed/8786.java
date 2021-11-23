@java.lang.Override
public java.util.List<com.axon.bank.dao.entity.ApplicantEntity> getLoanApplicants() {
    return ((java.util.List<com.axon.bank.dao.entity.ApplicantEntity>) (super.getHibernateTemplate().find("from ApplicantEntity")));
}