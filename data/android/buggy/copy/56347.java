private boolean isRecordValid() {
    return ((-1) == (totalRecords)) || ((com.intel.hibench.streambench.util.RecordSendTask.recordsCounter) < (totalRecords));
}