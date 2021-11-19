public static android.graphics.drawable.Drawable getImageResourceByName(android.app.Activity context, java.lang.String imageName) {
    java.lang.String packageName = context.getPackageName();
    int resId = context.getResources().getIdentifier(imageName, "drawable", packageName);
    return context.getDrawable(resId);
}