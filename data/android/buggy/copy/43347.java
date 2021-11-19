@java.lang.Override
public int getPriority() {
    if ((full_variation) == null) {
        return 0;
    }else {
        return full_variation.getPriority();
    }
}