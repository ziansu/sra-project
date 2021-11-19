public boolean dismissInform(int informId) {
    java.lang.String sqlDismissInform = "DELETE FROM `RoomInform` WHERE `informId` = ?;";
    return (jdbc.update(sqlDismissInform, new java.lang.Object[]{ informId })) == 1;
}