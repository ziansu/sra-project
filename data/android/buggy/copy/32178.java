@android.support.annotation.Nullable
public Model valueOrNull() {
    if ((offset) != (-1)) {
        return getOrNull(offset);
    }
    return getOrNull(0);
}