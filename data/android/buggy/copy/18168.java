@java.lang.Override
public php.runtime.Memory assign(php.runtime.Memory memory) {
    switch (value.type) {
        case REFERENCE :
            return value.assign(memory);
        case ARRAY :
            value.unset();
        default :
            return value = memory;
    }
}