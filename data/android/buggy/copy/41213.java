@java.lang.Override
public void onActivityActivate() {
    getLog().info("Activity is.erle.mavlink activate");
    java.util.Map<java.lang.String, java.lang.Object> temp = com.google.common.collect.Maps.newHashMap();
    temp.put("mission", "START");
}