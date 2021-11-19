public static int getLongSide(android.app.Activity activity) {
    com.easy.util.MeasureUtil.measure(activity);
    return (com.easy.util.MeasureUtil.type) == (com.easy.util.MeasureUtil.TYPE_PHONE) ? com.easy.util.MeasureUtil.screenHeight : com.easy.util.MeasureUtil.screenWidth;
}