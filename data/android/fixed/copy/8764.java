public void saveProfile(com.mealtime.bean.UserMaster userMaster) {
    userMaster.setUpdatedDate(new java.util.Date());
    userMaster.setIsActive("YES");
    userMasterDAO.update(userMaster);
}