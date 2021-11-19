public br.ufg.inf.pitanga.entidades.Cliente recuperarClientePorEmail(java.lang.String email) {
    if ((email == null) || (email.equals(""))) {
        throw new java.security.InvalidParameterException("email");
    }
    return clienteRepository.findByEmail(email);
}