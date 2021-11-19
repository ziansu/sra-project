@java.lang.Override
public final int hashCode() {
    int h = hashCode;
    if (h == (org.kframework.backend.java.util.Utils.NO_HASHCODE)) {
        h = computeHash();
        hashCode = (h == 0) ? 1 : h;
    }
    return h;
}