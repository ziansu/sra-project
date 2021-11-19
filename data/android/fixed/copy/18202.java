@java.lang.Deprecated
public com.afollestad.bridge.Config requestConverter(@android.support.annotation.NonNull
java.lang.String contentType, @android.support.annotation.Nullable
com.afollestad.bridge.conversion.base.RequestConverter converter) {
    return requestConverter(contentType, (converter != null ? converter.getClass() : null));
}