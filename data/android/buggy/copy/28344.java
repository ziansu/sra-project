public org.zapodot.junit.ldap.EmbeddedLdapRuleBuilder withoutDefaultSchema() {
    this.addDefaultSchema = true;
    return this;
}