public boolean addAdministratedSubject(de.learny.domain.Subject subject) {
    this.administratedSubjects.add(subject);
    if (!(subject.getAccountsInCharge().contains(this))) {
        subject.addAccountInCharge(this);
    }
    return true;
}