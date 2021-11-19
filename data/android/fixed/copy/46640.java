public static void showTree(absyn.CompoundExp tree, int spaces) {
    absyn.Absyn.showTree(tree.decs, spaces);
    absyn.Absyn.showTree(tree.exps, spaces);
}