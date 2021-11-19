private org.uengine.essencia.modeling.canvas.ElementView findPracticeRootElement(java.util.List<org.uengine.essencia.modeling.canvas.IElement> practiceElementList) {
    org.uengine.essencia.modeling.canvas.ElementView practiceRootElementView = null;
    for (org.uengine.essencia.modeling.canvas.IElement element : practiceElementList) {
        if (element instanceof org.uengine.essencia.model.Practice) {
            practiceRootElementView = element.getElementView();
            break;
        }
    }
    return practiceRootElementView;
}