public void testAddClaim() throws exceptions.InvalidDateException, exceptions.InvalidNameException, exceptions.InvalidUserPermissionException {
    this.makeRegularClaim();
    this.makeInvalidClaimEmpty();
    this.makeInvalidClaimNull();
    this.makeInvalidClaimDate();
    this.addClaim();
}