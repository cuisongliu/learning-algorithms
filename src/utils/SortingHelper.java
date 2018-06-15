package utils;
/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 cuisongliu@qq.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/**
 * 排序帮助类
 *
 * @author cuisongliu [cuisongliu@qq.com]
 * @since 2018-06-15 下午1:10
 */
public class SortingHelper {
    private SortingHelper() {
    }

    /**
     * 生成随机数组
     *
     * @param n      产生数组内的元素数量
     * @param rangeL 随机最小值
     * @param rangeR 随机最大值
     * @return
     */
    public static Integer[] generatorRandomArray(Integer n, Integer rangeL, Integer rangeR) {
        assert rangeL <= rangeR;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            // 数量乘以 大于1 的值 然后 + 最小值
            arr[i] = (int) (Math.random() * (rangeR - rangeL + 1) + rangeL);
        }
        return arr;
    }

    /**
     * 打印输出数组
     *
     * @param arr 需要输出的数组
     */
    private static void printArray(Object arr[]) {
        int i = 0;
        for (Object obj : arr) {
            if (i % 10 == 9) {
                System.out.println(String.format("%5s", obj) + "   ");
            } else {
                System.out.print(String.format("%5s", obj) + "   ");
            }
            i++;
        }
    }


    public static <T extends Comparable> void testSort(Sorting sorting, T[] arr) {
        //设置参数
        long startTime = System.currentTimeMillis();
        sorting.sort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println(sorting.getClass().getSimpleName() + ":执行所用毫秒数为" + (endTime - startTime) + "ms,执行所用秒数为" + (endTime - startTime) / 1000.0 + "s");
    }

    public static <T extends Comparable> void testPrint(Sorting sorting, T[] arr) {
        sorting.sort(arr);
        printArray(arr);
        System.out.println();
        System.out.println();
    }
}
