public void setCompanyId(long company_id) {
    models.Company company = models.Company.get(company_id);
    if (company == null) {
        company = new models.Company();
        company.id = company_id;
    }
}