@java.lang.Override
public int hashCode() {
    java.lang.String allCapsName = name.toUpperCase();
    return ((expireDate.hashCode()) * (allCapsName.hashCode())) + (id);
}