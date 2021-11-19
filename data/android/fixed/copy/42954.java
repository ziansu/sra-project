public org.openstreetmap.josm.data.validation.TestError.Builder fix(java.util.function.Supplier<org.openstreetmap.josm.command.Command> fixingCommand) {
    org.openstreetmap.josm.tools.CheckParameterUtil.ensureThat(((this.fixingCommand) == null), "fixingCommand already set");
    this.fixingCommand = fixingCommand;
    return this;
}