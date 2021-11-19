public java.util.List<java.lang.String> getAliases() {
    if (null == (getLiveState().aliases)) {
        return new java.util.ArrayList<>();
    }else {
        return getLiveState().aliases;
    }
}