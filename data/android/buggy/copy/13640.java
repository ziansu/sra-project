public java.lang.String getHarvestTool(int metadata) {
    tterrag.customthings.common.config.json.BlockType type = getType(metadata);
    return type.toolType.isEmpty() ? block.getHarvestTool(metadata) : type.toolType;
}