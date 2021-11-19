public void run() {
    loadCitizensData();
    saveCitizensData();
    one.lindegaard.MobHunting.compatibility.CitizensCompat.masterMobHunterManager.initialize();
    findMissingSentry();
    loadBountyDataForSentryOrSentinel();
}