public void requestRender() {
    if ((mView) != null) {
        mView.requestRender();
        client.setData(fr.limsi.ARViewer.FluidMechanics.getData());
        client.setSelectionData(fr.limsi.ARViewer.FluidMechanics.getSelectionData());
    }
}