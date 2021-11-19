public void setFaction(boolean myFaction) {
    startFactionIsTerror = myFaction;
    eco = new com.evilcorp.csgo_shadow.Eco(startFactionIsTerror);
    updateRoundView();
    android.util.Log.i("faction2", ("01 " + (startFactionIsTerror)));
}