package org.twentymethods;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TwentyMethods {

    private static final Random random = new Random();

    private TwentyMethods() {
        throw new IllegalStateException("Utility class");
    }

    //    Task 1 - принимает массив чаров, выводит его на экран
    public static String printCharArray(char[] arr) {
        if (checkIfCharArrayIsNullOrEmpty(arr)) {
            return "";
        }
        System.out.println(arr);
        return new String(arr);
    }

    //    Task 2 - принимает массив интов, возвращает массив чаров,
    //    каждый символ в позиции массива соответствует коду символа передаваемого инта
    public static char[] convertIntToCharArray(int[] integers) {
        if (checkIfIntArrayIsNullOrEmpty(integers)) {
            return new char[0];
        }
        char[] chars = new char[integers.length];
        for (int i = 0; i < integers.length; i++) {
            char newChars = (char) (integers[i]);
            chars[i] = newChars;
        }
        return chars;
    }

    //    Task 3.1 - приминает 2 инта, а и б, возвращает большее их этих 2х чисел
    public static int findTheLargestOfTwoInts(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    //    Task 3.2
    public static int findTheLargestOfTwoIntsUsingTernaryOperator(int a, int b) {
        return (a > b) ? a : b;
    }

    //    Task 3.3
    public static int findTheLargestOfTwoIntsUsingMathClass(int a, int b) {
        return Math.max(a, b);
    }

    //    Task 4.1 - принимает 3 инта, возвращает большее из них
    public static int findTheLargestOfThreeInts(int a, int b, int c) {
        if ((a > b) & (a > c)) {
            return a;
        }
        if (b > c) {
            return b;
        }
        return c;
    }

    //    Task 4.2
    public static int findTheLargestOfThreeIntsUsingTernaryOperator(int a, int b, int c) {
        if ((a > b) & (a > c)) {
            return a;
        }
        return b > c ? b : c;
    }

    //    Task 4.3
    public static int findTheLargestOfThreeIntsUsingMethodsThatFindTheLargestOfTwoInts(int a, int b, int c) {
        return findTheLargestOfTwoInts(findTheLargestOfTwoInts(a, b), c);
    }

    //    Task 5.1 - приминает 5 интов, возвращает большее из них
    public static int findTheLargestOfFiveInts(int a, int b, int c, int d, int e) {
        int theLargestInt = a;
        if (b > theLargestInt) {
            theLargestInt = b;
        }
        if (c > theLargestInt) {
            theLargestInt = c;
        }
        if (d > theLargestInt) {
            theLargestInt = d;
        }
        if (e > theLargestInt) {
            theLargestInt = e;
        }
        return theLargestInt;
    }

    //    Task 5.2
    public static int findTheLargestOfFiveIntsUsingMethodThatFindTheLargestOfThreeIntsUsingTernaryOperator(int a, int b, int c, int d, int e) {
        return findTheLargestOfThreeIntsUsingTernaryOperator(findTheLargestOfThreeIntsUsingTernaryOperator(a, b, c), d, e);
    }

    //    Task 6 - принимает массив чаров, возвращает строку состоящую из символов массива
    public static String convertCharArrayToString(char[] chars) {
        if (checkIfCharArrayIsNullOrEmpty(chars)) {
            return "";
        }
        return new String(chars);
    }

    //!!!    Task 7 - принимает массив интов, возвращает индекс массива,
    //    в котором значение совпадает с ним. Если значения в массиве нет возвращает -1
    public static int findIndexOfIntegersThatMatchesWithInt(int[] integers) {
        int a = -1;
        if (checkIfIntArrayIsNullOrEmpty(integers)) {
            return a;
        }
        for (int i = 0; i < integers.length; i++) {
            if (i == integers[i]) {
                return i;
            }
        }
        return a;
    }


    //    Task 8 - принимает массив интов, и значение типа инт,
    //    возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива.
    //    Если значения в массиве нет возвращает -1
    public static int findValueOfIndexInIntArrayThatMatchesWithInt(int[] integers, int intToFind) {
        int a = -1;
        if (checkIfIntArrayIsNullOrEmpty(integers)) {
            return a;
        }
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == intToFind) {
                return i;
            }
        }
        return a;
    }

    //    Task 9 принимает массив интов, и значение типа инт, возвращает индекс массива,
    //    в котором значение совпадает с передаваемым, начиная с конца массива.
    //    Если значения в массиве нет возвращает -1
    public static int findIndexOfIntegersFromTheEndThatMatchesWithItsValue(int[] integers, int intToFind) {
        int a = -1;
        if (checkIfIntArrayIsNullOrEmpty(integers)) {
            return a;
        }
        for (int i = integers.length - 1; i >= 0; i--) {
            if (integers[i] == intToFind) {
                return i;
            }
        }
        return a;
    }

    //    Task 10.1 - метод принимает инт, и возвращает факториал от заданого инта
    public static BigInteger findFactorial(int intFactor) {
        if (intFactor < 0 || intFactor > 50) {
            return BigInteger.valueOf(-1);
        }
        if (intFactor == 0) {
            return BigInteger.valueOf(1);
        }
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 2; i <= intFactor; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    //    Task 10.2
    public static BigInteger findFactorialByRecursion(int intFactor) {
        if (intFactor < 0 || intFactor > 50) {
            return BigInteger.valueOf(-1);
        }
        if (intFactor == 0) {
            return BigInteger.valueOf(1);
        }
        BigInteger result = BigInteger.valueOf(intFactor);
        return result.multiply(findFactorialByRecursion(intFactor - 1));
    }


    // Task 11 - принимает инт год, и возвращает тру если год высокосный
    public static boolean isLeap(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    // Task 12 - приминает массив интов и число,
    // выводит на екран только елементы массива которые кратны этому числу
    public static List<Integer> findValuesWhichAreDivisibleByANumberWithoutARemainder(int[] integers, int number) {
        List<Integer> list = new ArrayList<>();
        if ((checkIfIntArrayIsNullOrEmpty(integers)) || (number < 0) || (number == 0)) {
            return list;
        }
        for (int j : integers) {
            if (j % number == 0) {
                list.add(j);
            }
        }
        return list;
    }

    // Task 13.1 - метод принимает массив интов сортирует его по возрастанию
    public static int[] sortArrayInAscendingOrderWithBubbleSortAlgorithm(int[] integers) {
        if (checkIfIntArrayIsNullOrEmpty(integers)) {
            return new int[0];
        }
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < integers.length - 1; i++) {
                if (integers[i] > integers[i + 1]) {
                    temp = integers[i];
                    integers[i] = integers[i + 1];
                    integers[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        return integers;
    }

    // Task 13.2 - метод принимает массив интов сортирует его по возрастанию
    public static int[] sortArrayInAscendingOrderWithInsertionSortAlgorithm(int[] integers) {
        if (checkIfIntArrayIsNullOrEmpty(integers)) {
            return new int[0];
        }
        int j;
        for (int i = 1; i < integers.length; i++) {
            int swap = integers[i];
            for (j = i; j > 0 && swap < integers[j - 1]; j--) {
                integers[j] = integers[j - 1];
            }
            integers[j] = swap;
        }
        return integers;
    }

    // Task 14.1 - принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
    public static boolean findEqualElementsInByteArrayWithPreliminarySorting(byte[] bytes) {
        if (checkIfByteArrayIsNullOrEmpty(bytes)) {
            return false;
        }
        Arrays.sort(bytes);
        for (int i = 0; i < bytes.length - 1; i++) {
            if (bytes[i] == bytes[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // Task 14.2
    public static boolean findEqualElementsInByteArrayWithLoopingThroughArrayTwice(byte[] bytes) {
        if (checkIfByteArrayIsNullOrEmpty(bytes)) {
            return false;
        }
        for (int i = 0; i < bytes.length - 1; i++) {
            for (int j = i + 1; j < bytes.length; j++) {
                if (bytes[i] == bytes[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Task 15 - принимает два массива интов одинаковых по длинне,
    // возращает массив интов который состоит из перемноженных елементов входящих массивов
    public static int[] getIntArrayOfMultipliedValues(int[] integers1, int[] integers2) {
        if ((isEachNull(integers1, integers2))
                || (integers1.length != integers2.length)) {
            return new int[0];
        }
        for (int i = 0; i < integers1.length; i++) {
            long longResult = (long) integers1[i] * integers2[i];
            if (longResult > Integer.MAX_VALUE || longResult < Integer.MIN_VALUE) {
                return new int[0];
            } else {
                integers1[i] = integers1[i] * integers2[i];
            }
        }
        return integers1;
    }

    // Task 16 - принимает два массива интов, возвращает массив из елементов которые не совпадают в массивах
    public static List<Integer> getNonMatchingIndexes(int[] integers1, int[] integers2) {
        List<Integer> result = new ArrayList<>();
        if (isEachNull(integers1, integers2)) {
            return result;
        }
        int maxLength = Math.max(integers1.length, integers2.length);
        for (int i = 0; i < maxLength; i++) {
            if ((i < integers1.length) & (i < integers2.length)) {
                if (integers1[i] != integers2[i]) {
                    result.add(integers1[i]);
                }
            } else if (integers1.length > integers2.length) {
                result.add(integers1[i]);
            } else {
                result.add(integers2[i]);
            }
        }
        return result;
    }

    // Task 17 - принимает масив интов, возвращает его же но в реверсном порядке
    public static int[] getArrayOfIntegersWithValuesInReverseOrder(int[] intArray) {
        if (checkIfIntArrayIsNullOrEmpty(intArray)) {
            return new int[0];
        }
        int temp;
        for (int i = 0; i < intArray.length / 2; i++) {
            temp = intArray[i];
            intArray[i] = intArray[intArray.length - i - 1];
            intArray[intArray.length - i - 1] = temp;
        }
        return intArray;
    }

    // Task 18 - принимает 3 инта:
    //- размер выходного массива
    //- нижняя граница
    //- верхняя граница
    //возвращает массив интов заданой длинный, который содержит случайные числа от нижней границы до верхней границы"
    public static int[] getRandomArrayWithBounds(int sizeOfIntArray, int lowerBorder, int upperBorder) throws IllegalArgumentException {
        Runtime r = Runtime.getRuntime();
        int maxSizeOfArray = (int) (((float) r.maxMemory() / 4) * 0.95);
        if ((lowerBorder >= upperBorder) || (sizeOfIntArray <= 0)) {
            return new int[0];
        }
        if (sizeOfIntArray > maxSizeOfArray) {
            throw new IllegalArgumentException("Size of array is larger than program can handle");
        }
        int[] newArrInt = new int[sizeOfIntArray];
        for (int i = 0; i < sizeOfIntArray; i++) {
            int randomInt = random.nextInt(upperBorder - lowerBorder + 1) + lowerBorder;
            newArrInt[i] = randomInt;
        }
        return newArrInt;
    }

    // Task 19.1 - принимает 2 массива чаров, проверяет есть ли в 1 массиве,
    // такая же последовательность символов которую представляет собой второй массив. Возвращает булеан
    public static boolean isSecondInFirst(char[] chars1, char[] chars2) {
        if (isEachNull(chars1, chars2)) {
            return false;
        }
        for (int i = 0; i <= (chars1.length - chars2.length); i++) {
            boolean matchFound = true;
            for (int j = 0; j < chars2.length; j++) {
                if (chars1[i + j] != chars2[j]) {
                    matchFound = false;
                    break;
                }
            }
            if (matchFound) {
                return true;
            }
        }
        return false;
    }

    // Task 19.2 - принимает 2 массива чаров, проверяет есть ли в 1 массиве,
    // такая же последовательность символов которую представляет собой второй массив. Возвращает булеан
    public static boolean isSecondInFirstWithUsingStrings(char[] chars1, char[] chars2) {
        if (isEachNull(chars1, chars2)) {
            return false;
        }
        return new String(chars1).contains(new String(chars2));
    }

    public static boolean checkIfIntArrayIsNullOrEmpty(int[] integers) {
        if (integers == null) {
            return true;
        }
        return integers.length == 0;
    }

    public static boolean checkIfByteArrayIsNullOrEmpty(byte[] bytes) {
        if (bytes == null) {
            return true;
        }
        return bytes.length == 0;
    }

    public static boolean checkIfCharArrayIsNullOrEmpty(char[] chars) {
        if (chars == null) {
            return true;
        }
        return chars.length == 0;
    }

    public static boolean isEachNull(int[] integers1, int[] integers2) {
        if (integers1 == null) {
            return true;
        }
        return integers2 == null;
    }

    private static boolean isEachNull(char[] chars1, char[] chars2) {
        if (chars1 == null) {
            return true;
        }
        return chars2 == null;
    }

}