package com.leetcode;

import com.leetcode.model.ListNode;
import com.leetcode.utils.RandomUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author hhe
 * @date 2021/2/3 17:35
 * @Description
 * 2. 两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution002 {
    private static Map<Integer, Integer> map = new HashMap();

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;

            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }

    public static void main(String[] args) {
        // 接收从控制台输入
        Scanner input = new Scanner(System.in);
        int n = input.nextInt() % 10;
        n = n < 5 ? 5 : n;
        // 获取随机数
        int[] nums = RandomUtils.randomCommon(0, 10, n);
        System.out.println("nums = " + Arrays.toString(nums));
        ListNode l1 = null;
        for (int i = 0; i < 3; i++) {
            l1 = ListNode.push(l1, nums[i]);
        }

        ListNode l2 = null;
        for (int i = 3; i < n; i++) {
            l2 = ListNode.push(l2, nums[i]);
        }
        ListNode listNode = new Solution002().addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
        System.out.println("=====end=====");
    }
}
