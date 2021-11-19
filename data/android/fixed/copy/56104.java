@java.lang.Override
public void initializeGraphicalViewer() {
    super.initializeGraphicalViewer();
    if ((getDiagram()) != null) {
        idees.gama.features.modelgeneration.ModelGenerator.modelValidation(getDiagramTypeProvider().getFeatureProvider(), getDiagram());
        doSave(null);
    }
}