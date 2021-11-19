private void visitForAllLeaves(it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep step) {
    for (it.unibas.lunatic.model.chase.chasemc.DeltaChaseStep child : step.getChildren()) {
        if (isLeaf(child)) {
            (counter)++;
        }else {
            visitForAllLeaves(child);
        }
    }
}