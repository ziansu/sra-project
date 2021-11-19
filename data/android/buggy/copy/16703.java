public static void withDefaultUser() {
    de.gfu.vaadin.model.User defaultUser = new de.gfu.vaadin.model.User();
    defaultUser.setLoginName("mb");
    defaultUser.setPassword(de.gfu.vaadin.support.Users.asHashedPassword("mb"));
    de.gfu.vaadin.persistence.UserRepository.save(defaultUser);
}