@java.lang.Override
public void run(java.lang.String... args) throws java.lang.Exception {
    userDAO.deleteAll();
    userDAO.save(new asa.User("Nevil", "ZNevzz"));
    java.lang.System.out.println(userDAO.findByFirstName("Nevil"));
}