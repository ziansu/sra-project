public static void start(@android.support.annotation.NonNull
de.jonasrottmann.realmbrowser.Context context, @android.support.annotation.NonNull
java.lang.String realmFileName) {
    android.content.Intent intent = new android.content.Intent(context, de.jonasrottmann.realmbrowser.RealmModelsActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    intent.putExtra(de.jonasrottmann.realmbrowser.RealmModelsActivity.EXTRAS_REALM_FILE_NAME, realmFileName);
    context.startActivity(intent);
}