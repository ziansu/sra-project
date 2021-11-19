@java.lang.Override
public msip.go.kr.member.entity.HeadMember findByNameAndEmail(java.lang.String userName, java.lang.String email) throws java.lang.Exception {
    msip.go.kr.member.entity.HeadMember result = headMemberDAO.findByNameAndEmail(userName, email);
    return result;
}