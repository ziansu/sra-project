private kotlin.jvm.internal.KFunction getReflected() {
    kotlin.jvm.internal.KFunction result = compute();
    if (result == (this)) {
        throw new kotlin.jvm.KotlinReflectionNotSupportedError();
    }
    return result;
}