@java.lang.Override
public int hashCode() {
    if ((id) != null) {
        return id.intValue();
    }
    return (post_title.hashCode()) * (post_date.hashCode());
}