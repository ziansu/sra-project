public com.afollestad.bridge.Config requestConverter(@android.support.annotation.NonNull
java.lang.String contentType, @android.support.annotation.Nullable
com.afollestad.bridge.conversion.base.RequestConverter converter) {
    if (converter == null)
        mRequestConverters.remove(contentType);
    else
        mRequestConverters.put(contentType, converter);
    
    return this;
}