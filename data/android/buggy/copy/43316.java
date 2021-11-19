@org.luaj.vm2.LuaFunction(value = "on")
public org.luaj.vm2.LuaValue on(org.luaj.vm2.LuaValue eventName, org.luaj.vm2.LuaValue callback) {
    eventHandlers.put(eventName.checkjstring(), callback.checkfunction());
    return org.luaj.vm2.LuaValue.NIL;
}