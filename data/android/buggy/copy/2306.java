public void taskReload() {
    int len = mMaterialList.size();
    for (int i = 0; i < len; i++) {
        org.rajawali3d.materials.Material material = mMaterialList.get(i);
        material.reload();
    }
}