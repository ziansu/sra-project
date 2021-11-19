public java.util.Set<classes.Exemplar> buscarListaExemplares(char letra) {
    if ((indiceExemplaresLetra.get(letra)) == null) {
        indiceExemplaresLetra.put(letra, new java.util.HashSet<classes.Exemplar>());
    }
    return indiceExemplaresLetra.get(letra);
}