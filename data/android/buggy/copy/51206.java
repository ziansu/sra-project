private void loadModel(dnnUtil.dnnModel.DnnModelDescriptor modelDescriptor) {
    jniLoadModel(mModelDescriptor.getBinaryData());
    jniGetWeightsData();
}