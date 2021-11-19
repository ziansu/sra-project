@java.lang.Override
public android.view.View initView() {
    android.view.View view = com.fuyi.googleplay.utils.UIUtils.inflate(R.layout.listview_home_item);
    tvContent = ((android.widget.TextView) (view.findViewById(R.id.tvContent)));
    return view;
}