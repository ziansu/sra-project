@java.lang.Override
public void newDatas(ganhuo.ly.com.ganhuo.mvp.entity.HuaResults data) {
    if (isTop) {
        girlyAdapter.getResults().clear();
    }
    pins = data.getPins();
    girlyAdapter.getHuaResults().addAll(pins);
    girlyAdapter.notifyDataSetChanged();
}