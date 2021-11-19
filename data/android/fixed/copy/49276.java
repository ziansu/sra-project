public void addProperties(java.util.Collection<com.martinlinha.c3faces.script.Property> props) {
    if (props == null) {
        return ;
    }
    for (com.martinlinha.c3faces.script.Property prop : props) {
        addProperty(prop);
    }
}