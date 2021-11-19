public java.lang.String getChr() {
    chr = chr.replace("chrom", "").replace("chro", "").replace("chr", "").replace("ch", "");
    return chr;
}