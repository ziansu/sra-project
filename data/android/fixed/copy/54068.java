public static void saveLastPath(java.io.File file, android.app.Activity act) {
    cn.liangxiwen.picpresser.SP.saveString(act, cn.liangxiwen.picpresser.SP.EXTRA_NAME_LAST_PATH, file.toString());
}