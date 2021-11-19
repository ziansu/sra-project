@java.lang.Override
public void createContents(org.eclipse.swt.widgets.Composite viewArea, java.util.Map<java.lang.String, org.eclipse.swt.graphics.Image> imageMap) {
    createBaseFrame(viewArea, imageMap);
    populateTopComposite(topComposite, imageMap);
    populateBottomComposite(bottomComposite, imageMap);
}