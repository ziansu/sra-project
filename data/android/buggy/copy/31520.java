@org.springframework.transaction.annotation.Transactional
public void removerTarefa(java.lang.Long id) {
    this.tarefaDAO.removerTarefa(id);
}