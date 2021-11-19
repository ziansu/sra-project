@java.lang.Override
public void updateUserInfoSuccessfull(com.travel.travelguide.Object.User user) {
    imageLocalPath = com.travel.travelguide.Ulti.Constants.EMPTY_STRING;
    com.travel.travelguide.manager.UserManager.getInstance().updateUserToDatabase(getActivity());
    com.travel.travelguide.Ulti.EvenBusHelper.getInstance().notifyUserDataChanged(user);
}