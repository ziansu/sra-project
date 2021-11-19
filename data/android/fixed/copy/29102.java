@java.lang.Override
public com.poseitech.assignment.entity.StudentProjectGrade addProjectToStudent(com.poseitech.assignment.entity.Student student, com.poseitech.assignment.entity.Project project) throws java.lang.Exception {
    com.poseitech.assignment.entity.StudentProjectGrade spg = new com.poseitech.assignment.entity.StudentProjectGrade();
    spg.setStudent(student);
    spg.setProject(project);
    getSession().saveOrUpdate(spg);
    return spg;
}