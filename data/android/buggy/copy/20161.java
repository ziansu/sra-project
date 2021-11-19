@org.springframework.transaction.annotation.Transactional
public com.gmail.dzhivchik.domain.Folder getFolder(java.lang.Integer id) {
    java.lang.System.out.println(("Eto id current folder: " + id));
    return folderDAO.getFolder(id);
}