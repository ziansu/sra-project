@java.lang.Override
public int hashCode() {
    int result = type.hashCode();
    result = (31 * result) + (subType.hashCode());
    return result;
}