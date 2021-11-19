@java.lang.Override
public boolean isValid(jakubchmielowiec.pointofsale.Barcode barcode) {
    java.lang.String code = barcode.getCode();
    return (code == null) || (code.trim().isEmpty());
}