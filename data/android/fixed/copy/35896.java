@javax.persistence.Transient
public org.demyo.model.Image getMainImage() {
    if (((images) == null) || (images.isEmpty())) {
        return null;
    }
    return images.iterator().next();
}