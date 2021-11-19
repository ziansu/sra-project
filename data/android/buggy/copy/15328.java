public co.krypt.kryptonite.git.CommitInfo commitInfo() {
    return new co.krypt.kryptonite.git.CommitInfo(tree, parent, author, committer, message.getBytes());
}