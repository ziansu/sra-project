public com.massivecraft.massivecore.mson.Mson command(java.lang.String command) {
    this.clickEvent(com.massivecraft.massivecore.mson.MsonEvent.performCmd(command));
    return this;
}