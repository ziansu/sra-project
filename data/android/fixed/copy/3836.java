public void setPackMaterialClass(com.giants3.hd.utils.entity.PackMaterialClass packMaterialClass) {
    if (packMaterialClass == null)
        return ;
    
    this.packMaterialClass = packMaterialClass;
    packMaterialType = packMaterialClass.type;
    packMaterialPosition = packMaterialClass.position;
}