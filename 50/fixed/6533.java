@android.support.annotation.Nullable
public java.lang.String getExisting(java.lang.String name) {
    return mCanonicalMap.get(makeCanonical(name));
}