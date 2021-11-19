public static boolean isVisible(org.pentaho.di.ui.spoon.trans.TransGraph graph) {
    if ((graph.getChildren().length) > 0) {
        return (graph.getChildren()[0]) instanceof org.eclipse.swt.browser.Browser;
    }
    return false;
}