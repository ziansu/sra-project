@java.lang.Override
public com.laboki.eclipse.plugin.smartsave.instance.Instance begin() {
    this.updateProperties();
    this.startListening();
    return super.begin();
}