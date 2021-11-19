private static java.io.File databaseFileLocation(android.content.Context ctx) {
    java.io.File f = ctx.getFilesDir();
    f = new java.io.File(f, com.chaosinmotion.securechat.messages.SCMessageDatabase.MESSAGEFILE);
    return f;
}