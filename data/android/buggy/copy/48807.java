@java.lang.Override
@org.springframework.transaction.annotation.Transactional(readOnly = true)
public java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getTopReceptionCounters(long date, int limit) {
    return dao.getTopMaxRanges(date, limit);
}