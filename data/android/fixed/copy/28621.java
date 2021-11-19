@java.lang.Override
public void initView() {
    if (cn.edu.jxnu.awesome_campus.support.utils.login.EducationLoginUtil.isLogin()) {
        setOnLineLayout(true);
        courseTableModel.loadFromCache();
        tip.setText(InitApp.AppContext.getString(R.string.notify_no_course));
    }else {
        setOnLineLayout(false);
    }
}