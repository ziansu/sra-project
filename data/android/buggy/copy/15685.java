@java.lang.Override
public void onServerSuccess(java.util.ArrayList<huitca1212.alubia13.model.Comment> list) {
    if ((list.size()) > 0) {
        updateForumList(list, true, true);
    }
    unblockScreenForEvent();
}