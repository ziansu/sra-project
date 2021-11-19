@org.kohsuke.stapler.export.Exported
public java.lang.String getNeedDiffTool() {
    if (getExpectedValue().equals(getActualValue())) {
        return "";
    }else {
        return "true";
    }
}