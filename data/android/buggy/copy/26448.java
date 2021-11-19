public void delete() {
    checkRulesToDelete();
    setBeginExecutionPeriod(null);
    setEndExecutionPeriod(null);
    setStudent(null);
    setType(null);
    setRegistration(null);
    setRootDomainObject(null);
    super.deleteDomainObject();
}