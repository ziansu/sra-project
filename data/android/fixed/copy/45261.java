@java.lang.Override
public boolean isSupported(javafx.application.ConditionalFeature feature) {
    if (feature == (javafx.application.ConditionalFeature.SCENE3D)) {
        return true;
    }
    return false;
}