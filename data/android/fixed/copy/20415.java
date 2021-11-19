public void deletePersonne(final int idToDelete) {
    final com.rafikzebdi.epargnator.domain.personne.Personne personneToDelete = em.find(com.rafikzebdi.epargnator.domain.personne.Personne.class, idToDelete);
    em.remove(personneToDelete);
}