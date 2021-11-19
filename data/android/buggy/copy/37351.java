private void initializeFurtherInformationDatabase() {
    furtherInformationDatabase = new com.example.tom.regensbad.Persistence.FurtherInformationDatabase(this);
    furtherInformationDatabase.open();
    dayTicket = furtherInformationDatabase.getDayTicket(closestPoolCivicID);
    infoOnCivicPool = furtherInformationDatabase.getSports(closestPoolCivicID);
}