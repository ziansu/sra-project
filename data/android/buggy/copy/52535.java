public com.fiivt.ps31.callfriend.AppDatabase.Event generateEvent(java.util.Date lastDate) {
    return new com.fiivt.ps31.callfriend.AppDatabase.Event(person, this, eventTemplate.getInfo(), generateDate(lastDate), com.fiivt.ps31.callfriend.Utils.Status.EXPECTED);
}