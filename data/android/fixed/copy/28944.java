public int getNumberOfUsersOnlineNow() {
    java.util.Date lastMinutes = getLastMinutes(1);
    com.soapboxrace.core.jpa.OnlineUsersEntity onlineUsersEntity = onlineUsersDAO.findByTime(lastMinutes);
    return onlineUsersEntity != null ? onlineUsersEntity.getNumberOfUsers() : 0;
}