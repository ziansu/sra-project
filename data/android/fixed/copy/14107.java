public void requestRender() {
    if ((mView) != null) {
        client.setData(fr.limsi.ARViewer.FluidMechanics.getData());
        client.setSelectionData(fr.limsi.ARViewer.FluidMechanics.getSelectionData());
        mView.requestRender();
    }
}