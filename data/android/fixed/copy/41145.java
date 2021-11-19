public void removePart(org.openpnp.model.Part part) {
    parts.remove(part.getId().toUpperCase());
    firePropertyChange("parts", null, parts);
}