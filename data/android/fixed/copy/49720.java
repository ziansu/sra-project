@java.lang.Override
public void writeToParcel(android.os.Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
    dest.writeSparseArray(((android.util.SparseArray) (this.commissions)));
}