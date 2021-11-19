public java.lang.String getOutPath() {
    if (!(commandLine.hasOption("outpath"))) {
        return null;
    }else {
        return commandLine.getOptionValue("outpath");
    }
}