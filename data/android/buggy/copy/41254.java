private void calculateDimensions() {
    rootInfo = recursiveCalculateDimensions(root);
    y = (rootInfo.depth) * 2;
    x = ((((rootInfo.leftDimension) + (rootInfo.rightDimension)) + 1) * 2) + 1;
}