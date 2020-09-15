package com.company.interview.tree;

/**
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/9 22:03
 */
public class DynamicCreateBTree {

    /**
     * 动态创建二叉查找树
     * @param treeRoot 根节点
     * @param value 从数组中获取的结点值
     */
    public static void crateBTree(TreeRoot treeRoot,int value){

        //如果树根为空，则选择第一个值作为根节点
        if(treeRoot.getTreeRoot() == null){
            TreeNode treeNode = new TreeNode(value);
            treeRoot.setTreeRoot(treeNode);
        }else{
            TreeNode tempRoot = treeRoot.getTreeRoot();
            while(tempRoot != null){
                //大于根就往右边走
                if(value > tempRoot.getValue()){
                    //右边没有就直接插入
                    if(tempRoot.getRightTreeNode() == null){
                        tempRoot.setRightTreeNode(new TreeNode(value));
                        return;
                    }else{
                        //如果右边有树就从树走下去
                        tempRoot = tempRoot.getRightTreeNode();
                    }
                }else{
                    //左边没有就直接插入
                    if(tempRoot.getLeftTreeNode() == null){
                        tempRoot.setLeftTreeNode(new TreeNode(value));
                        return;
                    }else{
                        //如果右边有树就从树走下去
                        tempRoot = tempRoot.getLeftTreeNode();
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[]  arrays = {2,3,1,4,5};

        TreeRoot root = new TreeRoot();
        for (int value:arrays
             ) {
            crateBTree(root,value);
        }

        //TraverseTest.inTraverseBTree(root.getTreeRoot());
        TraverseTest.preTraverseBTree(root.getTreeRoot());
        System.out.println("获取深度："+getHeight(root.getTreeRoot()));
        System.out.println("获取最大值："+getMax(root.getTreeRoot()));


    }

    //获取深度
    public static int getHeight(TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }else{
            int left = getHeight(treeNode.getLeftTreeNode());

            int right  = getHeight(treeNode.getRightTreeNode());

            int max = left;

            if(right > max){
                max = right;
            }
            return max + 1;
        }
    }

    public static int getMax(TreeNode treeNode){
        if(treeNode == null){
            return -1;
        }else{
            int left = getMax(treeNode.getLeftTreeNode());

            int right  = getMax(treeNode.getRightTreeNode());

            int currentRootValue = treeNode.getValue();

            int max = left;

            if(right > max){
                max = right;
            }
            if(currentRootValue > max){
                max = currentRootValue;
            }
            return max;
        }
    }
}
