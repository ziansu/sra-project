public void makeFirstSpeciesCounterpoint() {
    CantusFirmus cantusFirmus = makeCantusFirmus(false);
    TwoVoiceCounterpoint counterpoint = new TwoVoiceCounterpoint(cantusFirmus);
    counterpoint.pseudoComposeFromScratchInFirstSpecies();
    this.playerString = counterpoint.toString();
    play();
}