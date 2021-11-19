@java.lang.Override
public boolean isFreightCart() {
    if (((this) instanceof train.common.api.Freight) || ((this) instanceof train.common.api.LiquidTank)) {
        return true;
    }
    return false;
}