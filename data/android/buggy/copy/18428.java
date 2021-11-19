@org.springframework.transaction.annotation.Transactional
public void deleteGroup(ua.org.dancegrouptracker.model.Group group) {
    if ((findGroupById(group.getId())) != null) {
        groupDao.delete(group);
    }
}