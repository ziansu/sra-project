@java.lang.Override
public void newComment(net.sharksystem.sharknet.api.Content comment, net.sharksystem.sharknet.api.Contact author) {
    net.sharksystem.sharknet.api.Comment c = new net.sharksystem.sharknet.api.ImplComment(comment, author, this, owner);
    net.sharksystem.sharknet.api.DummyDB.getInstance().addComment(c, this);
}