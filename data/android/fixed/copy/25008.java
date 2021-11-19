@com.taobao.weex.common.WXModuleAnno
public void showItemNumber(java.lang.String id, com.taobao.weex.bridge.JSCallback callback) {
    int number = com.weex.sammy.mcshop.MCShoppingListHelper.showItemNumber(id);
    callback.invoke(number);
}