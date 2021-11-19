public void delete() {
    setBeginExecutionPeriod(null);
    setEndExecutionPeriod(null);
    setStudent(null);
    setType(null);
    setRegistration(null);
    setRootDomainObject(null);
    super.deleteDomainObject();
}