protected kotlin.jvm.internal.KCallable getReflected() {
    compute();
    if ((reflected) == (this)) {
        throw new kotlin.jvm.KotlinReflectionNotSupportedError();
    }
    return reflected;
}