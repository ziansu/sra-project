@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public edu.asu.spring.quadriga.dto.AboutTextDTO getDTOByProjectId(java.lang.String projectId) {
    return aboutTextDAO.getDTOByProjectId(projectId);
}