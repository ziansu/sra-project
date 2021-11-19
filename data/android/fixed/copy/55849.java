protected kotlin.jvm.internal.KCallable getReflected() {
    kotlin.jvm.internal.KCallable result = compute();
    if (result == (this)) {
        throw new kotlin.jvm.KotlinReflectionNotSupportedError();
    }
    return result;
}