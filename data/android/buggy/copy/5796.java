public static <E, O> ca.odell.glazedlists.matchers.SetMatcherEditor<E, O> create(final ca.odell.glazedlists.FunctionList.Function<E, O> fn, final ca.odell.glazedlists.matchers.SetMatcherEditor.Mode mode) {
    return new ca.odell.glazedlists.matchers.SetMatcherEditor<E, O>(fn, mode);
}