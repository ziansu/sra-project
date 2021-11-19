@java.lang.Override
public void delete(K key) {
    org.pg4200.datastructure.map.tree.BinaryTreeMap<K, V>.TreeNode node = find(key, root);
    if (node == null) {
        return ;
    }
    delete(key, node);
}