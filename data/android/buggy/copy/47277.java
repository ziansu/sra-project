public static java.lang.String[] getArea(java.lang.String logIP) {
    return com.udbac.hadoop.util.IPv42AreaUtil.mapArea.get(com.udbac.hadoop.util.IPv42AreaUtil.getIPcode(logIP)).split(",");
}