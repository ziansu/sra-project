public void initEditCommandEvent(int taskId, dooyit.parser.DateTime start, dooyit.parser.DateTime end) {
    editCommandType = EditCommandType.EVENT;
    this.dateTimeStart = start;
    this.dateTimeEnd = end;
}