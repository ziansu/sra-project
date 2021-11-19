public void savePartyDetails(final java.util.List<bronz.accounting.bunk.party.model.Party> partyToBeUpdated, final java.util.List<bronz.accounting.bunk.party.model.PartyTransaction> partyTransToBeUpdated) throws bronz.accounting.bunk.framework.exceptions.BunkMgmtException {
    this.partyDao.saveParties(partyToBeUpdated);
    this.partyDao.savePartyTransactions(partyTransToBeUpdated);
}