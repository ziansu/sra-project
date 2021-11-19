private static java.lang.String username(Classes.Funcionario user) {
    if ((user.getNome().length()) == 0) {
        return user.getUsuario();
    }
    return user.getNome();
}