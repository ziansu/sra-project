@javax.annotation.Nullable
@java.lang.Override
public java.lang.Void apply(@javax.annotation.Nullable
net.bither.bitherj.db.imp.base.ICursor c) {
    txItem[0] = net.bither.bitherj.db.imp.AbstractTxProvider.applyCursor(c);
    txExists[0] = true;
    return null;
}