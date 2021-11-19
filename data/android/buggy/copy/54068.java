public static void saveLastPath(java.io.File file, android.app.Activity act) {
    cn.liangxiwen.picpresser.SP.saveString(act, file.toString(), cn.liangxiwen.picpresser.SP.EXTRA_NAME_LAST_PATH);
}