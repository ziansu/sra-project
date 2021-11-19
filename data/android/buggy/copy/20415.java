public void deletePersonne(final java.lang.String idToDelete) {
    final com.rafikzebdi.epargnator.domain.personne.Personne personneToDelete = em.find(com.rafikzebdi.epargnator.domain.personne.Personne.class, idToDelete);
    em.remove(personneToDelete);
}