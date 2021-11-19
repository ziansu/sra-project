public <T extends politics.parties.Party> void voteParty(T party) {
    parliament.voteParty(party);
    notifyObservers(this);
}