@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapter, android.view.View view, int position, long id) {
    org.sfbtmc.bean.MainPageListBean listBean = mainPageMsgBean.getMsgBeanList().get((position - 1));
    viewDetailMainPageListMsg(listBean);
}