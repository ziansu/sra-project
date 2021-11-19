@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a new switch", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "boolean" , "function(b)" })
public org.protocoderrunner.apprunner.api.widgets.PSwitch newSwitch(boolean initstate) {
    initializeLayout();
    org.protocoderrunner.apprunner.api.widgets.PSwitch s = new org.protocoderrunner.apprunner.api.widgets.PSwitch(getContext());
    s.setChecked(initstate);
    return s;
}