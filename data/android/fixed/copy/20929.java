@java.lang.Override
public boolean isFinished() {
    return (this.forceFinished) || ((currentStatementIndex) == (this.statements.size()));
}