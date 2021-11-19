public static org.spongepowered.api.text.Text.Placeholder placeholder(java.lang.String key) {
    com.google.common.base.Preconditions.checkArgument((!(com.google.common.base.Preconditions.checkNotNull(key, "key").isEmpty())), "key cannot be empty");
    return new org.spongepowered.api.text.Text.Placeholder(key);
}