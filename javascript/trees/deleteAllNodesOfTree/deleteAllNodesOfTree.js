
/**
 * To delete all the nodes, we will have to make sure we do not delete a parent before we delete all of its children. Because if we delete the parent, then we lose the pointers to its children
 */

//Recursive solution

function deleteTree(node) {
    if (node == NULL) return;

    // Delete left, right subtrees
    deleteTree(node.left);
    deleteTree(node.right);
    //Now delete parent
    deleteNode(node);
}