@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a progress bar of n units", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "units" })
public org.protocoderrunner.apprunner.api.widgets.PProgressBar newProgress(int max) {
    initializeLayout();
    org.protocoderrunner.apprunner.api.widgets.PProgressBar pb = new org.protocoderrunner.apprunner.api.widgets.PProgressBar(getContext(), android.R.attr.progressBarStyleHorizontal);
    return pb;
}