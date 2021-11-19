public static com.objectivetruth.uoitlibrarybooking.userinterface.myaccount.myaccountloaded.MyAccountLoaded newInstance(com.objectivetruth.uoitlibrarybooking.data.models.UserModel userModel, com.objectivetruth.uoitlibrarybooking.data.models.usermodel.MyAccountDataLoginState myAccountDataLoginState, com.objectivetruth.uoitlibrarybooking.userinterface.myaccount.MyAccount parentMyAccountFragment) {
    com.objectivetruth.uoitlibrarybooking.userinterface.myaccount.myaccountloaded.MyAccountLoaded returnFragment = new com.objectivetruth.uoitlibrarybooking.userinterface.myaccount.myaccountloaded.MyAccountLoaded();
    returnFragment.userData = myAccountDataLoginState.userData;
    returnFragment.parentMyAccountFragment = parentMyAccountFragment;
    returnFragment.userModel = userModel;
    return returnFragment;
}