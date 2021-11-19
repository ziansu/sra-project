public java.util.List<java.lang.Integer> getAllbySnack(int snack) {
    javax.persistence.Query query = entityManager.createQuery("SELECT e.idIngredient FROM SnackIngredients e WHERE e.idSnack = :snackId");
    return ((java.util.List<java.lang.Integer>) (query.setParameter("snackId", snack).getResultList()));
}