public static java.lang.Long getLong(java.lang.String sql, java.lang.String... args) {
    java.lang.String s = java.lang.String.valueOf(ids.sardine.TransferUtil.getObject(sql, args));
    return _String_.isNumber(s) ? java.lang.Long.parseLong(s) : null;
}