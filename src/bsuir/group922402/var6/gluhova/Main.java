package bsuir.group922402.laba1.var6.gluhova;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;



//Заданы два массива – А(5) и В(4). Первым на печать вывести массив, содержащий наибольшее значение. Напечатать также это значение и его порядковый номер.

public class Main {
    public static void main(String args[])
    int[] arrayA = {3, 15, 6, 7, 8};
    int[] arrayB = {7, 30, 6, 4};
    int maxA = 0;
    int maxB = 0;
        for (int i = 0; i < 4; i++)
            if (arrayA[i] > maxA) {
        maxA = arrayA[i];
    }
        for (int i = 0; i < 3; i++)
            if (arrayB[i] > maxB) {
        maxB = arrayB[i];
    }