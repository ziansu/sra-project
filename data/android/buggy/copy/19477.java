public static void main(java.lang.String[] args) {
    java.io.File vcfFile = new java.io.File("trio.2010_06.ychr.sites.vcf.gz");
    htsjdk.variant.vcf.VCFFileReader reader = new htsjdk.variant.vcf.VCFFileReader(vcfFile);
    htsjdk.samtools.util.IntervalList list = reader.fromVcf(reader);
}