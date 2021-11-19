public java.util.List<com.br.model.Categoria> listar() {
    java.util.List<com.br.model.Categoria> result = java.util.Collections.emptyList();
    result = categoriaDAO.getAll();
    return result;
}