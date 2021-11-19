public boolean updateThesisApplyStatus(cn.edu.hust.common.ThesisApplyStatus applyStatus, java.lang.String zzxh) {
    return (thesisApplyDao.updateThesisApplyStatus(applyStatus.getValue(), zzxh)) > 0;
}