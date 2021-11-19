@java.lang.Override
public void setScript(org.wilson.world.java.Script script) {
    org.wilson.world.endpoint.ScriptableEndPoint.script = script;
    this.loadMethods();
}