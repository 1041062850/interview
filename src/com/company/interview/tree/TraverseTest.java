package com.company.interview.tree;

/**
 * 通过三种方法遍历二叉树
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/9 21:45
 */
public class TraverseTest {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(35);

        treeNode1.setLeftTreeNode(treeNode2);
        treeNode1.setRightTreeNode(treeNode3);

        treeNode3.setLeftTreeNode(treeNode4);
        treeNode3.setRightTreeNode(treeNode5);

        //前序遍历
        //preTraverseBTree(treeNode1);

        //中序遍历
        //inTraverseBTree(treeNode1);

        //后序遍历
        sufTraverseBTree(treeNode1);
    }

    /**
     * 先序遍历
     * @param rootTreeNode 根节点
     */
    public static void preTraverseBTree(TreeNode rootTreeNode){
        if(rootTreeNode != null){
            //根节点
            System.out.println(rootTreeNode.getValue());

            //左结点
            preTraverseBTree(rootTreeNode.getLeftTreeNode());

            //右结点
            preTraverseBTree(rootTreeNode.getRightTreeNode());
        }

    }


    /**
     * 中序遍历
     * @param rootTreeNode 根节点
     */
    public static void inTraverseBTree(TreeNode rootTreeNode){
        if(rootTreeNode != null){
            //左结点
            inTraverseBTree(rootTreeNode.getLeftTreeNode());

            //根节点
            System.out.println(rootTreeNode.getValue());

            //右结点
            inTraverseBTree(rootTreeNode.getRightTreeNode());
        }

    }

    /**
     * 后序遍历
     * @param rootTreeNode 根节点
     */
    public static void sufTraverseBTree(TreeNode rootTreeNode){
        if(rootTreeNode != null){
            //左结点
            sufTraverseBTree(rootTreeNode.getLeftTreeNode());

            //右结点
            sufTraverseBTree(rootTreeNode.getRightTreeNode());

            //根节点
            System.out.println(rootTreeNode.getValue());


        }

    }
}
