org.parboiled.Rule ColumnComputationColumn() {
    return Sequence(AnyValue(), SomeWhiteSpace(), "AS", SomeWhiteSpace(), Identifier());
}