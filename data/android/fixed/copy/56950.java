@java.lang.Override
public void onError(int i, java.lang.String s) {
    android.util.Log.d(context.getPackageName(), ("queryReply err: " + s));
    listener.onError(s);
}