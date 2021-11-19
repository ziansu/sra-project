@java.lang.Override
public mt.edu.um.b_d_app.AtomicTransaction currentItem() {
    if ((this.index) < (this.transactions.size())) {
        return this.transactions.get(index);
    }
    return null;
}