public static void checkLoginBean(ekyss.model.LoginBean bean) {
    bean.setLogin(new ekyss.model.DatabaseHandler().loginUser(bean.getUsername(), bean.getPassword(), bean.getSelectedGroup()));
}