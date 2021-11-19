public org.verapdf.pd.font.PDFont getFont(org.verapdf.cos.COSName name) {
    if (name != null) {
        return getFont(name.getName());
    }else {
        return null;
    }
}