package sorting.basic.insertion;
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

import sorting.basic.selection.template.SelectionSort;
import utils.Algorithms;
import utils.Sorting;
import utils.SortingHelper;

/**
 * 插入排序 没有优化的版本
 *
 * @author cuisongliu [cuisongliu@qq.com]
 * @since 2018-07-16 上午9:39
 */
public class Insertion1Sort implements Sorting {
    @Override
    public <T extends Comparable> void sort(T[] arr) {
        for (int i = 1 ; i< arr.length; i++){
            //寻找元素arr[i]合适的插入位置
            for (int j = i;j> 0 ; j --){
                if (arr[j].compareTo(arr[j-1]) <0)
                    Algorithms.swap(arr,j,j-1);
                else break;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] randomTestArr1 = SortingHelper.generatorRandomArray(10000,1,100000);
        Integer[] randomTestArr2 = SortingHelper.generatorRandomArray(10000,1,100000);
        SortingHelper.testSort(new SelectionSort(),randomTestArr1);
        SortingHelper.testSort(new Insertion1Sort(),randomTestArr2);

    }
}
