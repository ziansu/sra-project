@java.lang.Override
public boolean equals(final java.lang.Object obj) {
    if ((obj == null) || (!(obj instanceof ru.simpleGBD.App.Logic.Proxy.HttpHostExt)))
        return false;
    
    return host.equals(((ru.simpleGBD.App.Logic.Proxy.HttpHostExt) (obj)).getHost());
}