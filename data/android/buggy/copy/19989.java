public static com.turbo.model.search.content.ImageSearchEntity from(final com.turbo.model.UserImage image) {
    return new com.turbo.model.search.content.ImageSearchEntity(image.getId(), image.getDescription(), image.getUserId(), image.getCreationDate());
}