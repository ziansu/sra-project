@java.lang.Override
public cw3.ReturnObject head() {
    if (isEmpty()) {
        return new cw3.ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
    }else {
        return this.get(0);
    }
}