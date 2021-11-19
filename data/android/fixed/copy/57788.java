public void dismissInform(int informId) {
    java.lang.String sqlDismissInform = "DELETE FROM `RoomInform` WHERE `informId` = ?;";
    jdbc.update(sqlDismissInform, informId);
}