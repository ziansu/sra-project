@java.lang.Override
public net.praqma.jenkins.configrotator.scm.clearcaseucm.ClearCaseUCMConfigurationComponent clone() throws java.lang.CloneNotSupportedException {
    net.praqma.jenkins.configrotator.scm.clearcaseucm.ClearCaseUCMConfigurationComponent cc = ((net.praqma.jenkins.configrotator.scm.clearcaseucm.ClearCaseUCMConfigurationComponent) (super.clone()));
    cc.baseline = this.baseline;
    cc.plevel = this.plevel;
    cc.fixed = this.fixed;
    return cc;
}