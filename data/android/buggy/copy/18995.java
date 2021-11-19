@java.lang.Override
public com.erss.Models.Message find(com.erss.Models.Teacher t) {
    com.erss.Models.Message msg = new com.erss.Models.Message(com.erss.Models.Message.MSG_SUCCESS);
    msg.setMsgContent(teacherRepository.find(t));
    return msg;
}