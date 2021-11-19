public io.sysmo.nchecks.Argument get(java.lang.String key) {
    if (this.arguments.containsKey(key)) {
        return this.arguments.get(key);
    }else {
        return new io.sysmo.nchecks.Argument();
    }
}