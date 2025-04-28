package queue;

import static queue.leetcode_102.S_1_failed.levelOrder;

public class Main {
    public static void main(String[] args) {
        var tree = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        levelOrder(tree);
    }
}
