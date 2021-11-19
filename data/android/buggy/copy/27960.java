static void init(java.util.ArrayList<java.util.ArrayList<java.lang.Float>> dataList, java.util.ArrayList<java.lang.Long> time) {
    edu.temple.gymminder.DataUtils.data = dataList;
    edu.temple.gymminder.DataUtils.timestamps = time;
    edu.temple.gymminder.DataUtils.processedData = null;
    edu.temple.gymminder.DataUtils.avgNode = null;
}