@java.lang.Override
public wyal.lang.Formula.Inequality clone(wyal.lang.SyntacticItem[] children) {
    return new wyal.lang.Formula.Inequality(getSign(), ((wyal.lang.Polynomial) (children[0])), ((wyal.lang.Polynomial) (children[1])));
}