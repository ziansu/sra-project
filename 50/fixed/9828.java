private boolean ifUserGroupKey(com.deloitte.smt.dto.SearchDto searchDto) {
    return !(org.springframework.util.CollectionUtils.isEmpty(searchDto.getUserGroupKeys()));
}