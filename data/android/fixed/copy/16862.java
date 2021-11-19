@java.lang.Override
public cz.muni.fi.pa165.pokemon.entity.Pokemon findById(java.lang.Long id) {
    return em.find(cz.muni.fi.pa165.pokemon.entity.Pokemon.class, id);
}