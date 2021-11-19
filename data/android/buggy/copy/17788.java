public <T> void registerGlobal(java.lang.String display, T value) {
    globals.add(new io.f8k.fleet.common.log.LogEntryProperty(display, value.toString()));
}