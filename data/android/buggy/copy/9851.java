@org.springframework.transaction.annotation.Transactional
public void remove(int id) {
    com.ontime.model.Project project = new com.ontime.model.Project();
    project.setId(id);
    dao.remove(project);
}