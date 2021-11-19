public boolean isUmbuchung() {
    if (isSplitBuchung()) {
        return false;
    }
    return (getAsLong(R.string.column_transfer_ID)) != null;
}