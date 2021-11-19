@java.lang.Override
public org.uva.ql.ast.value.Value strNotEqual(org.uva.ql.ast.value.Str arg) {
    return new org.uva.ql.ast.value.Bool(((arg.getValue()) != (getValue())));
}