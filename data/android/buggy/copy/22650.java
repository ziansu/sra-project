@com.tsuru2d.engine.lua.ExposeToLua
public boolean removeContent(com.tsuru2d.engine.uiapi.UIWrapper wrapper) {
    return mTable.removeActor(wrapper.getActor());
}