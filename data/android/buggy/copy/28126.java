public foo.CollectionFieldsBuilder numbers(java.lang.Long... numbers) {
    if (numbers == null) {
        throw new java.lang.NullPointerException("numbers");
    }
    return numbers(foo.Arrays.asList(numbers));
}