package com.leetcode;

import com.leetcode.demo.SpiDemo;
import com.leetcode.register.LocalRegister;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author hhe
 * @Date 2021/2/3 17:35
 * @Description -Xss2m -Dmock=5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problemset/all/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MainStart {
    public static int max = 100;

    public static String solution = "solutionV0001";

    public static List<String> registNames = new ArrayList<>();

    static {
        registNames.add("spiDemo");
        LocalRegister.regist("spiDemo", SpiDemo.class);

        registNames.add("solutionV0016");
        registNames.add("solutionV0022");
        registNames.add("solutionV0322"); // com.leetcode.model.ListNode

        registNames.add("solutionV0221");
        registNames.add("solutionV0367");
        registNames.add("solutionV0500");
        registNames.add("solutionV0697");

        /**
         * LCP 01. 猜数字（简单）
         */
//        registNames.add("solutionLCP01");
//        LocalRegister.regist("solutionLCP01", SolutionLCP01.class);

        /********************************* registNames *********************************/
        /**
         * 1. 两数之和（简单）
         * 2. 两数相加（中等）
         * 3. 无重复字符的最长子串（中等）
         * 4. 寻找两个正序数组的中位数（困难）
         * 11. 盛最多水的容器（中等）
         * 12. 整数转罗马数字（中等）
         * 13. 罗马数字转整数（简单）
         * 14. 最长公共前缀（简单）
         * 15. 三数之和（中等）
         * 16. 最接近的三数之和（中等）
         * 18. 四数之和（中等）
         * 22. 括号生成（中等）
         * 48. 旋转图像（中等）
         * 58. 最后一个单词的长度（简单）
         * 75. 颜色分类（中等）
         */
        registNames.add("solutionV0001");
        registNames.add("solutionV0002"); // com.leetcode.model.ListNode
        registNames.add("solutionV0003");
        registNames.add("solutionV0004"); // com.leetcode.model.ListNode
        registNames.add("solutionV0011");
        registNames.add("solutionV0012"); // com.leetcode.model.ListNode
        registNames.add("solutionV0014");
        registNames.add("solutionV0015");
        registNames.add("solutionV0018");
        registNames.add("solutionV0048");
        registNames.add("solutionV0058");
        registNames.add("solutionV0075");

        /**
         * 101. 对称二叉树（简单）
         * 135. 分发糖果（困难）
         * 201. 数字范围按位与（中等）
         * 202. 快乐数（简单）
         * 221. 最大正方形（中等）
         * 231. 2的幂（简单）
         * 322. 零钱兑换（中等）
         * 326. 3的幂（简单）
         * 342. 4的幂（简单）
         * 344. 反转字符串（简单）
         * 367. 有效的完全平方数（简单）
         * 500. 键盘行（简单）
         * 697. 数组的度（简单）
         */
//        registNames.add("solutionV0101"); // com.leetcode.model.TreeNode
//        registNames.add("solutionV0135");
//        registNames.add("solutionV0201");
//        registNames.add("solutionV0202");
//        registNames.add("solutionV0231");
//        registNames.add("solutionV0326");
//        registNames.add("solutionV0342");
//        registNames.add("solutionV0344");

        /********************************* LocalRegister *********************************/
        LocalRegister.regist("solutionV0001", SolutionV0001.class);
        LocalRegister.regist("solutionV0002", SolutionV0002.class);
        LocalRegister.regist("solutionV0003", SolutionV0003.class);
        LocalRegister.regist("solutionV0004", SolutionV0004.class);
        LocalRegister.regist("solutionV0011", SolutionV0011.class);
        LocalRegister.regist("solutionV0012", SolutionV0012.class);
        LocalRegister.regist("solutionV0013", SolutionV0013.class);
        LocalRegister.regist("solutionV0014", SolutionV0014.class);
        LocalRegister.regist("solutionV0015", SolutionV0015.class);
        LocalRegister.regist("solutionV0016", SolutionV0016.class);
        LocalRegister.regist("solutionV0018", SolutionV0018.class);
        LocalRegister.regist("solutionV0022", SolutionV0022.class);
        LocalRegister.regist("solutionV0048", SolutionV0048.class);
        LocalRegister.regist("solutionV0058", SolutionV0058.class);
        LocalRegister.regist("solutionV0075", SolutionV0075.class);

        LocalRegister.regist("solutionV0101", SolutionV0101.class);
        LocalRegister.regist("solutionV0135", SolutionV0135.class);
        LocalRegister.regist("solutionV0201", SolutionV0201.class);
        LocalRegister.regist("solutionV0202", SolutionV0202.class);
        LocalRegister.regist("solutionV0221", SolutionV0221.class);
        LocalRegister.regist("solutionV0231", SolutionV0231.class);
        LocalRegister.regist("solutionV0322", SolutionV0322.class);
        LocalRegister.regist("solutionV0326", SolutionV0326.class);
        LocalRegister.regist("solutionV0342", SolutionV0342.class);
        LocalRegister.regist("solutionV0344", SolutionV0344.class);
        LocalRegister.regist("solutionV0367", SolutionV0367.class);
        LocalRegister.regist("solutionV0500", SolutionV0500.class);
        LocalRegister.regist("solutionV0697", SolutionV0697.class);
    }

    public static void main(String[] args) {
        try {
            for (int i = 0; i < registNames.size(); i++) {
                System.out.println("i = " + i);
                if (registNames.get(i).equals(solution)) {
                    return;
                }
                Class clazz = LocalRegister.get(registNames.get(i));
                Constructor constructor = clazz.getDeclaredConstructor(int.class);
                constructor.newInstance(max);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
