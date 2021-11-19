public void setFaction(boolean myFaction) {
    startFactionIsTerror = myFaction;
    eco = new com.evilcorp.csgo_shadow.Eco(startFactionIsTerror);
    updateRoundView();
}