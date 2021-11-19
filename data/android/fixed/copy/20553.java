public static void setCurrentContext(java.lang.String holderId) {
    angularBeans.context.NGSessionContextHolder selectedHolder = angularBeans.context.GlobalMapHolder.get(holderId);
    angularBeans.context.NGSessionScopeContext.holder.set(selectedHolder);
}