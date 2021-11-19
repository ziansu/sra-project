public void removeTag(br.com.codecode.workix.jpa.models.Tag tag) {
    if ((tags) == null) {
        tags = new java.util.ArrayList<>();
    }
    tags.remove(tag);
}