@java.lang.Override
public java.lang.Object get(org.hawk.core.model.IHawkAttribute attr) {
    java.lang.String name = attr.getName();
    switch (name) {
        case "version" :
            return (version) != null;
        default :
            return null;
    }
}