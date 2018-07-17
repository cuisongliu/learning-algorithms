package sorting.basic.shell;
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

import sorting.basic.insertion.Insertion1Sort;
import sorting.basic.insertion.Insertion2Sort;
import utils.Algorithms;
import utils.Sorting;
import utils.SortingHelper;

/**
 * 希尔排序
 *
 * @author cuisongliu [cuisongliu@qq.com]
 * @since 2018-07-17 下午4:29
 */
public class SellSort implements Sorting {
    @Override
    public <T extends Comparable> void sort(T[] arr) {
        int dataLength = arr.length;
        int h = 1;
        while (h < dataLength/3) h = 3*h + 1;
        while (h >= 1){
            for (int i=h; i< dataLength; i++){
                for (int j=i; j>=h && arr[j].compareTo(arr[j-h]) < 0;j -=h){
                    Algorithms.swap(arr,j,j-h);
                }
            }
            h = h/3;
        }
    }


    //近乎有序的数据插入排序 效率很高
    public static void main(String[] args) {
        Integer[] randomTestArr1 = SortingHelper.generatorRandomArray(100000,1,100000);
        Integer[] randomTestArr2 = SortingHelper.generatorRandomArray(100000,1,100000);
        SortingHelper.testSort(new Insertion1Sort(),randomTestArr1);
        SortingHelper.testSort(new Insertion2Sort(),randomTestArr1 );

    }
}
