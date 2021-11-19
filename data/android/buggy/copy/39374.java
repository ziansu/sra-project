void onSuccess(cn.bmob.imdemo.imsdk.po.MessagePo messagePo) {
    adapter.addMessage(messagePo);
    adapter.notifyDataSetChanged();
    edit_msg.setText("");
    scrollToBottom();
}