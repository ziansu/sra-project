@java.lang.Override
public void dispose() {
    super.dispose();
    getOWLModelManager().removeListener(this.listener);
    if ((this.sqwrlQueryEngineModel) != null)
        this.sqwrlQueryEngineModel.unregisterOntologyListener();
    
}