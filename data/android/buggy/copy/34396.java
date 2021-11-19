@java.lang.Override
public java.lang.Object run() {
    javax.management.ObjectName objectName = com.alibaba.druid.stat.DruidDataSourceStatManager.addDataSource(this, this.name);
    if (objectName != null) {
        this.setObjectName(objectName);
        this.mbeanRegistered = true;
    }
    return null;
}