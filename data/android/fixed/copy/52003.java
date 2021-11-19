public java.lang.String getUserCount(cn.springmvc.model.VoucherModel vmodel) {
    return voucherDao.getUserCount(vmodel.getFilter());
}