public static int getLongSide(android.content.Context context) {
    com.easy.util.MeasureUtil.measure(context);
    return (com.easy.util.MeasureUtil.screenHeight) > (com.easy.util.MeasureUtil.screenWidth) ? com.easy.util.MeasureUtil.screenHeight : com.easy.util.MeasureUtil.screenWidth;
}