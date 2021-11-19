private javafx.scene.paint.Color getColorFromBlock(int block) {
    if (block < 10) {
        return Constants.COLOR_RULES[(block - 1)];
    }
    return Constants.COLOR_RULE_DEFAULT;
}