@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj instanceof com.delect.motiver.server.jdo.training.Exercise) {
        return (((com.delect.motiver.server.jdo.training.Exercise) (obj)).getId()) == (getId());
    }else {
        return false;
    }
}