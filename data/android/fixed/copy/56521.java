@java.lang.Override
public java.io.File persistentPath(build.pluto.example.GACInput input) {
    return new java.io.File(input.target, "gac.dep");
}