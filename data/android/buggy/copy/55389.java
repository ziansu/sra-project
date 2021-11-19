@java.lang.Override
public java.util.Date findInceptionEndtDate(java.lang.Long projectId) {
    com.archsystemsinc.ipms.sec.model.FinancialHeader header = headerDao.findRecentHeader(projectId);
    if (header != null)
        return header.getEndDate();
    
    return null;
}