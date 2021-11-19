@android.support.annotation.NonNull
@java.lang.Override
public java.lang.String getType() {
    android.util.Log.e(TAG, ("Type " + (type)));
    return !(android.text.TextUtils.isEmpty(type)) ? type : STORY_TYPE;
}