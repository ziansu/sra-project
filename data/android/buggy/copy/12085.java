@org.springframework.transaction.annotation.Transactional
public long create(com.adogo.ad.entity.AdPostGalleryImage contentObj) {
    long intFlag = 0L;
    if (contentObj.getMediaUrl().isEmpty()) {
        return this.adPostDao.create(contentObj);
    }
    return intFlag;
}