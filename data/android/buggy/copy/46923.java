public void show() {
    if (isVisible())
        return ;
    
    fillMesh.show();
    strokeMesh.show();
    update();
}