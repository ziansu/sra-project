org.parboiled.Rule ColumnComputationColumn() {
    return Sequence(Identifier(), SomeWhiteSpace(), "AS", SomeWhiteSpace(), AnyValue());
}