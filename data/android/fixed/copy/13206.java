@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a new button", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "label" , "function()" })
public org.protocoderrunner.apprunner.api.widgets.PButton newButton(java.lang.String label) {
    initializeLayout();
    org.protocoderrunner.apprunner.api.widgets.PButton b = new org.protocoderrunner.apprunner.api.widgets.PButton(getActivity());
    b.setText(label);
    return b;
}