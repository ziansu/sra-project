@java.lang.Override
public void call(java.util.List<com.classic.wages.entity.WorkInfo> list) {
    if (com.classic.core.utils.DataUtil.isEmpty(list)) {
        clear();
    }else {
        replaceAll(list);
    }
}