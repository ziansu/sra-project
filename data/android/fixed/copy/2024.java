@java.lang.Override
@org.springframework.cache.annotation.Cacheable(value = "apply", key = "#ID.toString()")
public com.example.demo.entity.dataModel.ApplyInfo findByApplyID(java.lang.Long ID, org.apache.shiro.subject.Subject subject) throws com.example.demo.service.exception.NotFoundException {
    com.example.demo.entity.dataModel.ApplyInfo applyInfo = applyDao.findApplyInfoById(ID);
    return applyInfo;
}