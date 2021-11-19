private javafx.scene.paint.Color getColorFromBlock(int block) {
    if (block < (Constants.COLOR_RULES.length)) {
        return Constants.COLOR_RULES[block];
    }
    return Constants.COLOR_RULE_DEFAULT;
}