@org.springframework.transaction.annotation.Transactional
public org.egov.tl.entity.FeeMatrix update(final org.egov.tl.entity.FeeMatrix feeMatrix) {
    final java.lang.String genUniqueNo = feeMatrix.genUniqueNo();
    feeMatrix.setUniqueNo(genUniqueNo);
    return feeMatrixRepository.save(feeMatrix);
}