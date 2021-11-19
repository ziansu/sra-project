public static void showTree(absyn.CompoundExp tree, int spaces) {
    absyn.Absyn.indent(spaces);
    absyn.Absyn.showTree(tree.decs, spaces);
    absyn.Absyn.showTree(tree.exps, spaces);
}