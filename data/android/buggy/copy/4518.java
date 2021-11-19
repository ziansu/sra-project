@java.lang.Override
public void deleteProperty(java.lang.String name) {
    for (com.samdlc.jini.IProperty prop : properties) {
        if (prop.getName().equals(name))
            properties.remove(prop);
        
    }
}