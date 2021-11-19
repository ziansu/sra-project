public void writeLoginMessagePackage() {
    try {
        com.ihuxu.chatxserver.common.model.MessagePackage mP = new com.ihuxu.chatxserver.common.model.MessagePackage(com.ihuxu.chatxserver.common.model.MessagePackage.TYPE_LOGIN_SUC_MSG);
        this.getObjectOutputStream().writeObject(mP);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}