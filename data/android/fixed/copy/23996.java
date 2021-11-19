@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a new checkbox", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "name" , "boolean" , "function(boolean)" })
public org.protocoderrunner.apprunner.api.widgets.PCheckBox newCheckbox(java.lang.String label, boolean initstate) {
    initializeLayout();
    org.protocoderrunner.apprunner.api.widgets.PCheckBox cb = new org.protocoderrunner.apprunner.api.widgets.PCheckBox(getContext());
    cb.setChecked(initstate);
    cb.setText(label);
    return cb;
}