package TreeUtils;

/**
 * This is a common class to be used for all tree related problems.
 */
public class TreeNode {
	public int val;

	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}

	public TreeNode(TreeNode left, int val, TreeNode right) {
		this.left = left;
		this.val = val;
		this.right = right;
	}
}