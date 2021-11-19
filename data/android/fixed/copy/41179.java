@org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED)
@org.springframework.beans.factory.annotation.Qualifier(value = "mysqlTx")
public boolean saveUser(com.wung.springdemo.bean.UserBean user) {
    boolean b1 = userDAO.saveUser(user);
    return b1;
}