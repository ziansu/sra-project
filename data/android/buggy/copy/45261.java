@java.lang.Override
public boolean isSupported(javafx.application.ConditionalFeature feature) {
    if (feature == (javafx.application.ConditionalFeature.SCENE3D)) {
        return true;
    }else
        if (feature == (javafx.application.ConditionalFeature.TRANSPARENT_WINDOW)) {
            return true;
        }
    
    return false;
}