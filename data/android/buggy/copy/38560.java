@java.lang.Override
public final int hashCode() {
    int hash = 31 + (getResolution().hashCode());
    hash = ((hash << 5) - hash) + (getBitsPerPixel());
    return hash;
}