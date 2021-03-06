package sorting.basic.selection;
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
 * 选择排序
 *
 * @author cuisongliu [cuisongliu@qq.com]
 * @since 2018-06-15 下午12:23
 */
public class SelectionSort {

    static  void sort(Integer[] arr){
        for (int i =0;i < arr.length ; i++){
            // 寻找 [i,arr.length) 区间的最小值
            for (int j =i+1 ;j< arr.length;j++){
                if (arr[j]< arr[i]){
                    //交换
                    int a = arr[i];
                    int b = arr[j];
                    // 异或交换
                    a = a^ b;
                    b = a^ b;
                    a = a^ b;
                    // 加法交换
                    a = a + b;
                    b = a - b;
                    a = a - b;
                    // 乘法交换 别出0 否则出现报错情况
                    a = a * b;
                    b = a / b;
                    a = a / b;
                    arr[i] = a;
                    arr[j] = b;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3,5,1,2,6,8,4,7,9};
        sort(arr);
        for (Integer s:arr) {
            System.out.print(s+ "   ");
        }
    }
}
