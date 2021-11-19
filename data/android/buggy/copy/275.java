@java.lang.Override
public boolean check(com.netflix.governator.auto.annotations.ConditionalOnModule param) {
    for (java.lang.Class<?> module : param.value()) {
        if (!(context.hasModule(module.getName()))) {
            return true;
        }
    }
    return true;
}