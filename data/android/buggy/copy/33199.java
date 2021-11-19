public void setUserImage() {
    java.lang.System.out.println(GUI.Controller.UserInfoViewController.MOD_FACADE.getUserImage(currentUser));
    imgVwProfilePic.setImage(new javafx.scene.image.Image(GUI.Controller.UserInfoViewController.MOD_FACADE.getUserImage(currentUser)));
}