# Leetcode-2025


[Array](#array) | [linkedList](#linkedlist) | [String](#string) | [Stack & Queue](#stack--queue) | [Tree](#tree)

[动态规划](#动态规划) | [滑动窗口](#滑动窗口) | [回溯](#回溯) | [贪心](#贪心)

[Misc](#misc)


## Array


- 0001 - [两数之和](https://leetcode.cn/problems/two-sum/description/) - [Java](java/src/main/java/q0001/Solution.java)


- 0027 - [移除元素](https://leetcode.cn/problems/remove-element/description/) - [Java](java/src/main/java/q0027/Solution.java)


- 0704 - [二分查找](https://leetcode.cn/problems/binary-search/description/) - [Java](java/src/main/java/q0704/Solution.java)


- 0977 - [有序数组的平方](https://leetcode.cn/problems/squares-of-a-sorted-array/description/) - [Java](java/src/main/java/0977/Solution.java)


- 0209 - [长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum/description/) - [Java](java/src/main/java/q0209/Solution.java)

  用两个指针滑动窗口：如果当前窗口的 `sum>=target` ，更新长度，右移 `left`，更新 `sum`；否则右移 `right`，更新 `sum`


- 1356 - [根据数字二进制下 1 的数目排序](https://leetcode.cn/problems/sort-integers-by-the-number-of-1-bits/description/) - [Java](java/src/main/java/q1356/Solution.java)


- 1365 - [有多少小于当前数字的数字](https://leetcode.cn/problems/how-many-numbers-are-smaller-than-the-current-number/description/) - [Java](java/src/main/java/q1365/Solution.java)


- 0941 - [有效的山脉数组](https://leetcode.cn/problems/valid-mountain-array/) - [Java](java/src/main/java/q0941/Solution.java)

  用 2 个 `while`，第一个 `while` 找到山顶，第二个 `while` 找到山脚，判断山顶山脚的位置是否合理

- 01207 - [独一无二的出现次数](https://leetcode.cn/problems/unique-number-of-occurrences/description/) - [Java](java/src/main/java/q1207/Solution.java)


## linkedlist


- 0724 - [寻找数组的中心下标](https://leetcode.cn/problems/find-pivot-index/description/) - [Java](java/src/main/java/q0724/Solution.java)


## String

- 0344 - [反转字符串](https://leetcode.cn/problems/reverse-string/description/) - [Java](java/src/main/java/q0344/Solution.java)


- 0925 - [长按键入](https://leetcode.cn/problems/long-pressed-name/description/) - [Java](java/src/main/java/q0925/Solution.java)


- 0844 - [比较含退格的字符串](https://leetcode.cn/problems/backspace-string-compare/description/) - [Java](java/src/main/java/q0844/Solution.java)