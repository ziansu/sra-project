@java.lang.Override
public boolean isChecked(T t) {
    if ((mMapper) == null) {
        throw new java.lang.InstantiationError("没有设置显示内容");
    }
    return mMapper.isChecked(t);
}