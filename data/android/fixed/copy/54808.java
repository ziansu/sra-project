@java.lang.Override
public java.lang.Boolean apply(A argument) {
    return (this.apply(argument)) && (predicate.apply(argument));
}