public lahome.rotateTool.module.RotateItem getPart(java.lang.String partNum) {
    for (lahome.rotateTool.module.RotateItem rotateItem : PartsList) {
        if (partNum.equals(rotateItem.getPartNumber())) {
            return rotateItem;
        }
    }
    return null;
}