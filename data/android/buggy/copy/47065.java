@java.lang.Override
public void call(java.util.List<com.classic.wages.entity.WorkInfo> list) {
    com.orhanobut.logger.Logger.d("onDataQuery - call");
    if (com.classic.core.utils.DataUtil.isEmpty(list)) {
        clear();
    }else {
        replaceAll(list);
    }
}