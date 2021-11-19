public boolean containsActor(model.Event event, java.lang.String actor) {
    return (event.getProperty("actors").contains(actor)) && ((event.getProperty("actors")) != null);
}