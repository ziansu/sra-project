void setLinearConstraints(java.awt.Component component, flat.layout.linear.constraints.LinearConstraints linearConstraints) {
    this.linearSpaceRatioMode = LinearSpaceRatioMode.WEIGHT;
    linearConstraintsMap.put(component, linearConstraints);
}