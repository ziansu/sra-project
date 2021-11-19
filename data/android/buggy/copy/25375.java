public final mytown.datasource.Resident newResident(java.util.UUID uuid, java.lang.String playerName) {
    mytown.datasource.Resident resident = new mytown.datasource.Resident(uuid, playerName);
    if (mytown.datasource.ResidentEvent.fire(new mytown.datasource.ResidentEvent.ResidentCreateEvent(resident)))
        return null;
    
    return resident;
}