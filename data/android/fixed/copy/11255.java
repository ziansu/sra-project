@java.lang.Override
public boolean supportsDevModeInJunit(com.google.gwt.core.ext.LinkerContext context) {
    return !("".equals(getHostedFilename()));
}