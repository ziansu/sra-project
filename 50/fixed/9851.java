@org.springframework.transaction.annotation.Transactional
public void remove(int id) {
    com.ontime.model.Project project = this.get(id);
    dao.remove(project);
}