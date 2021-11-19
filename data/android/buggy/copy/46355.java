public void saveMaterial(com.ia.materials.Material material) {
    saveObject(new java.io.File(com.ia.database.DataBase.MATERIAL_FILE, material.getName()), material);
}