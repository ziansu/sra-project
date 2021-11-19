@java.lang.Override
public boolean annotationDataExists() {
    return new java.io.File(molgenisSettings.getProperty(org.molgenis.data.annotation.impl.HpoServiceAnnotator.HPO_FILE_LOCATION)).exists();
}