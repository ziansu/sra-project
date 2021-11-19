public static models.RateCriterion create(java.lang.String name, java.lang.String description) {
    models.RateCriterion rate = new models.RateCriterion(name, description);
    rate.name = name;
    rate.description = description;
    rate.save();
}