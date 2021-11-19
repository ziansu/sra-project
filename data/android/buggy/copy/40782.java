public foo.NullableCollectionFieldsBuilder numbers(java.lang.Long... numbers) {
    if (numbers == null) {
        this.numbers = null;
        return this;
    }
    return numbers(foo.Arrays.asList(numbers));
}