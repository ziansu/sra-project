public void setRuntime(org.kie.eclipse.runtime.IRuntime runtime) {
    if (runtime != null) {
        this.runtime = runtime;
        editMode = true;
    }
}