public java.lang.String getDistributionList() {
    this.distributionIDList = dataid.mongodb.queries.Queries.getHTMLDistributionStatus();
    return distributionIDList;
}