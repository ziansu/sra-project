static com.gatf.selenium.Command read(java.lang.String filename) throws java.lang.Exception {
    java.util.List<java.lang.String> commands = org.apache.commons.io.FileUtils.readLines(new java.io.File(filename), "UTF-8");
    com.gatf.selenium.Command cmd = com.gatf.selenium.Command.getAll(commands, filename);
    return cmd;
}