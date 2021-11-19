public static boolean satisfiesTextContrast(int backgroundColor, int foregroundColor) {
    return (com.android.internal.util.NotificationColorUtil.calculateContrast(backgroundColor, foregroundColor)) >= 4.5;
}