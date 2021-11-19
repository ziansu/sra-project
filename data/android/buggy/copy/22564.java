@java.lang.Override
public java.util.List<cn.buk.api.wechat.service.WeixinUser> searchSubscribers(int enterpriseId, cn.buk.api.wechat.service.CommonSearchCriteria sc) {
    return weixinDao.searchSubscribers(this.weixinId, sc);
}