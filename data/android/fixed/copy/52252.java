@java.lang.Override
public void write(@android.support.annotation.NonNull
com.google.gson.stream.JsonWriter out, @android.support.annotation.NonNull
com.codebutler.farebot.core.ByteArray value) throws java.io.IOException {
    out.value((value != null ? value.base64() : null));
}