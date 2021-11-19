public de.uniulm.omi.cloudiator.sword.api.domain.LoginCredential build() {
    return new de.uniulm.omi.cloudiator.sword.core.domain.impl.LoginCredentialImpl(this.username, com.google.common.base.Optional.fromNullable(this.privateKey), com.google.common.base.Optional.fromNullable(this.password));
}