package com.company.interview.topic;

import java.util.Scanner;

/**去掉字符串中的（）内容  < 则删除 左边的几个字符
 * @Description TODO
 * @Author 计算机171 戴启东
 * @Date 2020/9/14 15:22
 */
public class XiaoHongShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuffer sb = new StringBuffer(str);
        sc.nextLine();
        //除括号
        int index = str.indexOf("(");
        while(index != -1){
            int index2 = sb.indexOf(")");
            sb = sb.delete(index,index2+1);
            index = sb.indexOf("(");
        }
        //除退格
        int tui = sb.indexOf("<");
        while(tui != -1){
            sb = sb.delete(tui-1,tui+1);
            tui = sb.indexOf("<");
        }
        System.out.println("最后出现："+sb.toString());
    }
}
