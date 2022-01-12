private void buildLayout() {
    setSizeUndefined();
    setMargin(true);
    com.vaadin.ui.HorizontalLayout actions = new com.vaadin.ui.HorizontalLayout();
    actions.setSpacing(true);
    addComponents(actions, restaurantName, foodType, location, hoursOfBusiness);
}