@java.lang.Override
public boolean isAlreadyBookedTicket(long seanceId, long placeId) {
    try {
        if ((ticketDao.getBySeanceAndPlace(seanceId, placeId)) != null) {
            return true;
        }
    } catch (org.springframework.dao.IncorrectResultSizeDataAccessException e) {
        return false;
    }
    return false;
}