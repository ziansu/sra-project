@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public java.lang.String getAboutTitle(java.lang.String projectId) {
    edu.asu.spring.quadriga.dto.AboutTextDTO aboutTextDTO = aboutTextDAO.getDTOByProjectId(projectId);
    return aboutTextDTO.getTitle();
}