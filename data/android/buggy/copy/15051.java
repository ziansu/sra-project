public com.massivecraft.massivecore.mson.Mson command(com.massivecraft.massivecore.cmd.MassiveCommand command, java.lang.String... args) {
    this.clickEvent(com.massivecraft.massivecore.mson.MsonEvent.performCmd(command, args));
    return this;
}