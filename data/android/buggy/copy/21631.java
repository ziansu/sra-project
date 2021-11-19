public ufc.quixada.npi.contest.model.Pessoa getAutorLogado() {
    org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    java.lang.String cpf = auth.getName();
    ufc.quixada.npi.contest.model.Pessoa autorLogado = pessoaService.getByCpf(cpf);
    return autorLogado;
}