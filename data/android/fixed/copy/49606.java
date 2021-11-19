private boolean meets_parent_type_constraint(org.dataconservancy.packaging.tool.model.ipm.Node node, org.dataconservancy.packaging.tool.model.ipm.Node parent, org.dataconservancy.packaging.tool.model.dprofile.NodeConstraint parent_constraint) {
    if (parent == null) {
        return false;
    }
    return parent_constraint.getNodeType().getIdentifier().equals(parent.getNodeType().getIdentifier());
}