package queue.leetcode_102;

import queue.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class S_1_failed {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> tree = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> r = new ArrayList<>();
        r.add(root.val);
        tree.add(r);
        List<Integer> help = new ArrayList<>();
        while (!queue.isEmpty()) {
            var pop = queue.pop();
            List<Integer> list = new ArrayList<>();
            if (pop.left != null) {
                queue.add(pop.left);
                list.add(pop.left.val);
            }
            if (pop.right != null) {
                queue.add(pop.right);
                list.add(pop.right.val);
            }
            if (list.size() == 2) {
                tree.add(list);
            } else if (list.size() == 1) {
                if (queue.size() == 1) {
                    tree.add(list);
                } else {
                    help.add(list.getFirst());
                    if (help.size() == 2) {
                        tree.add(help);
                    }
                }
            }
        }
        return tree;
    }
}
