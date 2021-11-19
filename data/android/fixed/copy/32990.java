public geometry.proofs.FigureRelation setProofGoal(geometry.proofs.FigureRelationType rel, java.lang.String fig0, java.lang.String fig1, geometry.proofs.FigureRelation parent) {
    geometry.proofs.FigureRelation newGoal = valueOf(rel, fig0, fig1, parent);
    return newGoal == null ? null : setProofGoal(newGoal);
}