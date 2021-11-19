protected char slash() {
    if ((java.lang.System.getProperty("os.name").toLowerCase().indexOf("win")) >= 0) {
        return '\\';
    }else {
        return '/';
    }
}