public java.lang.String getDescription() {
    java.lang.String description = specHandler.getDescription();
    return (description == null) || (description.equals("No description provided")) ? "" : description;
}