package com.company.interview.tree;

/**
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/9 21:44
 */
public class TreeNode {
    private TreeNode leftTreeNode;

    private TreeNode rightTreeNode;

    private int value;

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }
}
