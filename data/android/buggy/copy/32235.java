@java.lang.Override
public boolean isFixed() {
    for (com.piece_framework.makegood.core.result.Result result : children) {
        if (result.isFixed())
            return true;
        
    }
    return false;
}