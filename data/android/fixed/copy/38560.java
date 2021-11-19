@java.lang.Override
public final int hashCode() {
    int hash = getResolution().hashCode();
    hash = ((hash << 5) - hash) + (getBitsPerPixel());
    return hash;
}