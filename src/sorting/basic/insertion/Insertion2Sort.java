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

import utils.Sorting;
import utils.SortingHelper;

/**
 * 插入排序 没有优化的版本
 *
 * @author cuisongliu [cuisongliu@qq.com]
 * @since 2018-07-16 上午9:39
 */
public class Insertion2Sort implements Sorting {
    @Override
    public <T extends Comparable> void sort(T[] arr) {
        for (int i = 1 ; i< arr.length; i++){
            //寻找元素arr[i]合适的插入位置
            T e = arr[i];
            int j ;//j保存e应该插入的位置
            for (j = i;j> 0 && arr[j-1].compareTo(e) > 0  ; j --){
                arr[j] = arr[j-1];
            }
            arr[j] = e;
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
