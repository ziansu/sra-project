public static void log(java.lang.Object tag, java.lang.String message) {
    if (!(kaist.cs550_2016.poche.Debug.isDebug))
        return ;
    
    android.util.Log.w(tag.getClass().getSimpleName(), message);
}