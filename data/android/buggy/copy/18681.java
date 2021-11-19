@java.lang.Override
public void saveContacterInfo(com.jlfex.hermes.model.UserContacter userContacter) {
    userContacter.setStatus(com.jlfex.hermes.model.UserContacter.Status.VALID);
    java.util.Date curDate = new java.util.Date();
    userContacterRepository.save(userContacter);
}