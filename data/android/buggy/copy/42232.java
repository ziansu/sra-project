public void applyChangesToModel(minechem.apparatus.tier1.electrolysis.ElectrolysisTileEntity tileEntity) {
    if (tileEntity != null) {
        model.setLeftTube(tileEntity.hasLeftTube());
        model.setRightTube(tileEntity.hasRightTube());
    }
}