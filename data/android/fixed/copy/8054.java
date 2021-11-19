@java.lang.Override
public boolean isAlreadyBookedTicket(long seanceId, long placeId) {
    return (ticketDao.getBySeanceAndPlace(seanceId, placeId)) != null;
}