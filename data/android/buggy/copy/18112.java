@java.lang.Override
public void setLastUpdate() {
    super.setLastUpdate();
    if ((this.sequence) == null) {
        this.sequence = 0;
    }else {
        this.sequence = (this.sequence) + 1;
    }
}