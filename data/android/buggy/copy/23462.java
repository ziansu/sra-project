public void setRuntime(org.kie.eclipse.runtime.IRuntime runtime) {
    this.runtime = runtime;
    if (runtime != null)
        editMode = true;
    
}