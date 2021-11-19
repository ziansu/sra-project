public static java.util.UUID getUUIDOf(java.lang.String name) throws java.lang.Exception {
    return new haveric.recipeManager.uuidFetcher.UUIDFetcher(java.util.Arrays.asList(name)).call().get(name);
}