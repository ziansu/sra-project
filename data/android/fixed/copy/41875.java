public static boolean satisfiesTextContrast(int backgroundColor, int foregroundColor) {
    return (com.android.internal.util.NotificationColorUtil.calculateContrast(foregroundColor, backgroundColor)) >= 4.5;
}