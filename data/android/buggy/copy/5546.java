public java.lang.String getHostUser() {
    try {
        return this.getMessage().getString(communication.messages.udp.UDPMessageStatePM.TAG_HOST_USER);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
        return null;
    }
}