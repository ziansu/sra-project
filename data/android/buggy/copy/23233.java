@org.protocoderrunner.apidoc.annotation.ProtoMethod(description = "Creates a new plot", example = "")
@org.protocoderrunner.apidoc.annotation.ProtoMethodParam(params = { "min" , "max" })
public org.protocoderrunner.apprunner.api.widgets.PPlotView newPlot(int min, int max) {
    initializeLayout();
    org.protocoderrunner.apprunner.api.widgets.PPlotView jPlotView = new org.protocoderrunner.apprunner.api.widgets.PPlotView(getContext());
    jPlotView.setLimits(min, max);
    return jPlotView;
}