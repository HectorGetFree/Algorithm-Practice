package queue.leetcode_102;

import queue.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 思路是寻找每次迭代的不变量
// 比如说在进入树的下一层进行迭代前
// 队列的大小就是这层元素的个数
// 所以我们可以在进行下一层迭代之前
// 对这层的队列进行相应次数的遍历
// 从而得到该层的所有元素
public class S_official {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> tree = new ArrayList<>();
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                var poll = queue.poll();
                levelList.add(poll.val);
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
            tree.add(levelList);
        }
        return tree;
    }
}
