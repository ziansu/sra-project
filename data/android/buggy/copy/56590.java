public java.lang.String PrivMsgList(java.lang.String user, int counter) {
    dBInterface.Chat database = new dBInterface.Chat();
    boolean flag = false;
    java.lang.String Msg = database.PrivMsgList(user);
    return Msg;
}