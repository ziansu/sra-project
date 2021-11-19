private void validate(com.ibm.dpft.engine.core.dbo.DPFTDbo dbo) {
    if ((dbo.isNull("customer_id")) || (dbo.isNull("treatment_code"))) {
        dbo.delete();
        return ;
    }
    (valid_count)++;
}