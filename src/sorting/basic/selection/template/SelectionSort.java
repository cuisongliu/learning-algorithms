package sorting.basic.selection.template;
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

import utils.Sorting;
import utils.SortingHelper;
import utils.Algorithms;

/**
 * 选择排序
 *
 * @author cuisongliu [cuisongliu@qq.com]
 * @since 2018-06-15 下午12:23
 */
public class SelectionSort implements Sorting {

    public <T extends Comparable> void sort(T[] arr){
        for (int i =0;i < arr.length ; i++){
            // 寻找 [i,arr.length) 区间的最小值
            for (int j =i+1 ;j< arr.length;j++){
                if (arr[j].compareTo(arr[i]) < 0 ){
                    Algorithms.swap(arr,i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3,5,1,2,6,8,4,7,9};
        SortingHelper.testPrint(new SelectionSort(),arr);

        Student[] students = new Student[]{new Student(5),new Student(3),new Student(1),new Student(9),new Student(6)};
        SortingHelper.testPrint(new SelectionSort(),students);

        Integer[] randomArr = SortingHelper.generatorRandomArray(100,100,10000);
        SortingHelper.testPrint(new SelectionSort(),randomArr);

        Integer[] randomTestArr = SortingHelper.generatorRandomArray(10000,1,100000);
        SortingHelper.testSort(new SelectionSort(),randomTestArr);
    }
}
