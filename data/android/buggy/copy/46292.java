public boolean canEdit() {
    ro.deimios.icac.beans.UserBean userBean = ((ro.deimios.icac.beans.UserBean) (ro.deimios.icac.helpers.BeanHelper.getBean("userBean")));
    return (userBean.getUser().getAdminlevel()) >= (selectedPJ.getStare());
}