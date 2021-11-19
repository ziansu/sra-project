private static java.lang.String policyDetailsCompactRepr(proto.PolicyDTO.PolicyDetails policyDetails) {
    return java.lang.String.format("modAt=%s,creatAt=%s,creatBy=%s,policy=%s", policyDetails.getModifiedAt(), policyDetails.getModifiedBy(), policyDetails.getCreatedAt(), fk.prof.userapi.util.proto.PolicyDTOProtoUtil.policyCompactRepr(policyDetails.getPolicy()));
}