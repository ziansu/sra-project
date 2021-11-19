@java.lang.Override
public int hashCode() {
    return ((id) == null) || ((entryDate) == null) ? super.hashCode() : (id.hashCode()) + (entryDate.hashCode());
}