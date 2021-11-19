@java.lang.Override
public void saveCarInfo(com.jlfex.hermes.model.UserCar userCar) {
    userCar.setStatus(com.jlfex.hermes.model.UserCar.Status.VALID);
    userCarRepository.save(userCar);
}