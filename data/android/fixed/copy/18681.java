@java.lang.Override
public void saveContacterInfo(com.jlfex.hermes.model.UserContacter userContacter) {
    userContacter.setStatus(com.jlfex.hermes.model.UserContacter.Status.VALID);
    userContacterRepository.save(userContacter);
}