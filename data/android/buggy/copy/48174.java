@java.lang.Override
public void addField(de.jpaw.bonaparte.pojos.meta.BasicNumericElementaryDataItem di, java.math.BigInteger n) throws java.io.IOException {
    writeSeparator();
    if (n != null) {
        addRawData(numberFormat.format(n));
    }else {
        writeNull();
    }
}