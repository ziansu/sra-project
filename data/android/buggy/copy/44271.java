private void init() {
    active = new java.util.HashSet<>();
    me.jameshunt.hierarchyview.HierarchyLinearLayout hierarchyLinearLayout = new me.jameshunt.hierarchyview.HierarchyLinearLayout(getContext(), this);
    hierarchyLinearLayout.setHierarchyData(hierarchyData);
    addView(hierarchyLinearLayout);
}