public void setCompanyId(long company_id) {
    this.company_id = company_id;
    models.Company company = models.Company.get(company_id);
}