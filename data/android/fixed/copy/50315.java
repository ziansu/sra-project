@org.jetbrains.annotations.NotNull
com.shapesecurity.shift.fuzzer.GenCtx enterFunctional() {
    return new com.shapesecurity.shift.fuzzer.GenCtx(this.random, this.labels, this.iterationLabels, com.shapesecurity.functional.data.ImmutableList.nil(), com.shapesecurity.functional.data.ImmutableList.nil(), false, false, this.inStrictMode, true, true, true);
}