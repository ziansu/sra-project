@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void insertMessage(com.sbu.dao.model.MessageEntity message) {
    entityManager.persist(message);
}