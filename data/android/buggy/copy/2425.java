public boolean contains(java.lang.String name) {
    return pw.phylame.commons.util.StringUtils.isEmpty(name) ? false : map.containsKey(name);
}