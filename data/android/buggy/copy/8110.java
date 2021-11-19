@java.lang.Override
public boolean isAccountNonLocked() {
    return (user.getIsNotSuspended()) | (user.getIsNotBanned());
}