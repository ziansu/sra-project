@java.lang.SuppressWarnings(value = "unchecked")
public static <T> T getBean(java.lang.Class<T> clazz) {
    common.service.utils.SpringContextHolder.checkApplicationContext();
    return ((T) (common.service.utils.SpringContextHolder.applicationContext.getBeansOfType(clazz)));
}