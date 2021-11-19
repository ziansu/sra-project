public static int getImageResourceByName(android.app.Activity context, java.lang.String imageName) {
    java.lang.String packageName = context.getPackageName();
    return context.getResources().getIdentifier(imageName, "drawable", packageName);
}