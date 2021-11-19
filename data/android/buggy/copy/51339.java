private java.lang.String describeRange(Model.Regex.Construct construct) {
    java.lang.String[] values = construct.getText().split("-");
    return ((getBold(construct)) + " Character from a range: ") + (construct.getText());
}