private void assertWinCmdArgv(com.google.devtools.build.lib.util.CommandBuilder builder, java.lang.String expected) {
    assertArgv(builder, "CMD.EXE", "/S", "/E:ON", "/V:ON", "/D", "/C", (("\"" + expected) + "\""));
}