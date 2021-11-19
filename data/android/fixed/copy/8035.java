private boolean isDefault() {
    return (_type) instanceof gw.internal.gosu.parser.MetaType ? ((gw.internal.gosu.parser.MetaType) (_type)).isDefault() : _type.equals(gw.internal.gosu.parser.MetaType.DEFAULT_TYPE.get());
}