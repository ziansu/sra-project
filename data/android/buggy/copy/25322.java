private no.java.schedule.io.model.JzRegionList parseJzRegionList(java.lang.String fileToJsonObj) {
    try {
        return new com.estimote.sdk.repackaged.gson_v2_3_1.com.google.gson.Gson().fromJson(fileToJsonObj, no.java.schedule.io.model.JzRegionList.class);
    } catch (no.java.schedule.util.com.estimote e) {
        e.printStackTrace();
    }
    return null;
}