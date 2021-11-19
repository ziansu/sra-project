@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (!(o instanceof s2wmp.User)) {
        return false;
    }
    s2wmp.User other = ((s2wmp.User) (o));
    return id.equals(other);
}