public static java.util.UUID getUUIDOf(java.lang.String name) throws java.lang.Exception {
    return new haveric.recipeManager.uuidFetcher.UUIDFetcher(new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(name))).call().get(name);
}