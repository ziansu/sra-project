public static com.logn.gobanggame.factory.base.IStrategy create(java.lang.Class<? extends com.logn.gobanggame.factory.base.IStrategy> clazz) {
    java.lang.String clazzName = clazz.getName();
    if (clazzName.equals(com.logn.gobanggame.utils.PlayStrategy.class.getName())) {
        return new com.logn.gobanggame.utils.PlayStrategy();
    }
    return null;
}