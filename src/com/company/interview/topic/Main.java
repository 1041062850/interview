package com.company.interview.topic;

import java.util.*;

/**
 * 输入： 第一行：K（并非同时传递的值） N（总服务器数量）
 *       第二行：本行总结点 父亲结点 儿子结点1 儿子结点2 儿子结点3 ...
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/13 0:32
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        HashMap<Integer , Node> hashMap = new HashMap<>();

        int K = sc.nextInt();
        int N = sc.nextInt();

        if(K == 0 || N == 0){
            System.out.println(0);
        }

        sc.nextLine();

        //树形构建
        for(int i = 0;i < N;i++){
            int node_n = sc.nextInt();
            //指定父节点
            int parent_id = sc.nextInt();
            Node my = null;
            if(hashMap.containsKey(parent_id)){
                //父节点存在
                my = hashMap.get(parent_id);
            }else{
                //父节点不存在
                my = new Node();
                my.id = parent_id;
                hashMap.put(parent_id,my);
            }
            //儿子节点
            for(int j = 0;j < node_n - 1;j++){
                int son_id = sc.nextInt();
                if(hashMap.containsKey(son_id)){
                    //儿子节点存在
                    hashMap.get(parent_id).sons.add(hashMap.get(son_id));
                }else{
                    //儿子节点不存在
                    Node son = new Node();
                    son.id = son_id;
                    son.parent = my;
                    hashMap.put(son.id,son);
                    hashMap.get(parent_id).sons.add(son);
                }
            }
            sc.nextLine();
        }

        //根节点存在
        Node root = hashMap.get(0);
        //分治法
        System.out.println(FZ(root , K));

    }

    public static int FZ(Node node , int k){
        int max = 0;
        if(node.sons.size() == 0){
            return 0;
        }else{
            Integer[] sons_time = new Integer[node.sons.size()];
            int i = 0;
            //统计分支时间
            for(Node son:node.sons){
                sons_time[i++] = FZ(son , k);
            }
 /*           //合并分支与当前时间
            //降序排序
            Arrays.sort(sons_time, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });*/


            //计算当前节点为root所需要的时间
            int add = 1;
            for(int j = 0; j < sons_time.length ; j++){
                if(j!=0 && (j%k) == 0){
                    add++;
                }
                sons_time[j] += add;
                if(sons_time[j] > max){
                    max = sons_time[j];
                }
            }
        }
        return max;
    }
}
