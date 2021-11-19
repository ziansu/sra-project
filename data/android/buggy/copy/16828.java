@java.lang.Override
public int hashCode() {
    int result = path.hashCode();
    result = (31 * result) + (regularFile ? 1 : 0);
    return result;
}