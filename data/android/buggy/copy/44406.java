public java.util.List<cn.springmvc.model.UserParamModel> getUser(cn.springmvc.model.VoucherModel vmodel, cn.springmvc.model.BasicModel model) {
    return voucherDao.getUser(vmodel.getFilter(), vmodel.getOrder(), vmodel.getOffset(), vmodel.getCount());
}