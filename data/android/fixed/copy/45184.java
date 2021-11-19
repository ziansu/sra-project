@org.springframework.transaction.annotation.Transactional(value = "singleTransactionManager", rollbackFor = java.lang.Exception.class)
public void createNewCatAndSendMsg(com.ly.gproject.example.dao.model.Cat catObject) throws java.lang.Exception {
    catMapper.insert(catObject);
}