public static java.lang.String recievedAlliance(org.saga.factions.Faction faction, org.saga.factions.Faction source) {
    return (((faction.getColour2()) + "Recieved an alliance request from ") + (org.saga.messages.FactionMessages.faction(source))) + " faction.";
}