public static org.apache.uima.jcas.JCas getViewHandleDefault(org.apache.uima.jcas.JCas jCas, java.lang.String viewName) throws org.apache.uima.cas.CASException {
    if (viewName.equalsIgnoreCase(View.DEFAULT.name())) {
        viewName = View.DEFAULT.viewName();
    }
    return edu.ucdenver.ccp.nlp.uima.util.View_Util.getView(jCas, viewName);
}