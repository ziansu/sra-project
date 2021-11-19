public void removerFilme(classes.ufrpe.cine_easyplex.beans.Filme filme) throws classes.ufrpe.cine_easyplex.Exceptions.ValorInvalidoException {
    boolean remover = this.repositorioFilmes.remover(filme);
    if (remover) {
        java.lang.System.out.println("Adicionado com sucesso!");
    }else {
        java.lang.System.out.println("Sorry, guy, mas n rola");
    }
}