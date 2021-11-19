public bean.Security getSecurity(java.lang.String name) {
    for (bean.Security s : securities) {
        if (s.name.equals(name)) {
            return s;
        }
    }
    return null;
}