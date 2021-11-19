@java.lang.Override
public boolean isSet(org.hawk.core.model.IHawkStructuralFeature hsf) {
    java.lang.String name = hsf.getName();
    switch (name) {
        case "name" :
            return name != null;
        default :
            return false;
    }
}