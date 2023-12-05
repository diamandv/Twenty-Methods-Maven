package org.twentymethods;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwentyMethodsTests {

    //Task 1
    @Test
    void givenCharArray_whenConvertCharArrayToString_thenReturnString() {
        //given
        char[] chars = new char[]{'a', 'b', 'д', 'ц', '\'', '&', '.'};
        String expectedString = "abдц'&.";
        //when
        String actualString = TwentyMethods.printCharArray(chars);
        //then
        assertEquals(expectedString, actualString);
    }

    //Task 1
    @Test
    void givenEmptyCharArray_whenConvertArrayToString_thenReturnEmptyString() {
        //given
        char[] chars = new char[]{};
        String expectedString = "";
        //when
        String actualString = TwentyMethods.printCharArray(chars);
        //then
        assertEquals(expectedString, actualString);
    }

    //Task 1
    @Test
    void givenNullCharArray_whenConvertArrayToString_thenReturnEmptyString() {
        //given
        char[] chars = null;
        String expectedString = "";
        //when
        String actualString = TwentyMethods.printCharArray(chars);
        //then
        assertEquals(expectedString, actualString);
    }

    //Task 2
    @Test
    void givenDifferentIntValues_whenConvertIntArrayToCharArray_thenReturnCharArray() {
        //given
        int[] ints = new int[]{0, 65537, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
        char[] expectedChars = new char[]{'\u0000', '\u0001', '\uffff', '\uffff', '\u0000'};
        //when
        char[] actualChars = TwentyMethods.convertIntToCharArray(ints);
        //then
        assertArrayEquals(expectedChars, actualChars);
    }

    //Task 2
    @Test
    void givenDifferentIntValuesCorrespondingToCyrillicSymbols_whenConvertToCharArray_thenReturnCharArrayWithCyrillicCharacters() {
        //given
        int[] ints = new int[]{1045, 1078, 1080, 1082};
        char[] expectedChars = new char[]{'Е', 'ж', 'и', 'к'};
        //when
        char[] actualChars = TwentyMethods.convertIntToCharArray(ints);
        //then
        assertArrayEquals(expectedChars, actualChars);
    }

    //Task 2
    @Test
    void givenDifferentIntValuesCorrespondingToSomeSpecialSymbols_whenConvertIntArrayToCharArray_thenReturnCharArrayWithSpecialCharacters() {
        //given
        int[] ints = new int[]{8, 27, 33, 36, 43, 64, 169};     // 8 - Backspace, 27 - Escape character
        char[] expectedChars = new char[]{'\u0008', '\u001b', '!', '$', '+', '@', '©'};     // '\u0008' - Backspace in Unicode, '\u001b' - Escape character
        //when
        char[] actualChars = TwentyMethods.convertIntToCharArray(ints);
        //then
        assertArrayEquals(expectedChars, actualChars);
    }

    //Task 2
    @Test
    void givenNullIntArray_whenConvertToCharArray_thenReturnEmptyCharArray() {
        char[] actualChars = TwentyMethods.convertIntToCharArray(null);
        assertEquals(0, actualChars.length);
    }

    //Task 2
    @Test
    void givenEmptyIntArray_whenConvertToCharArray_thenReturnEmptyCharArray() {
        //given
        int[] ints = new int[]{};
        //when
        char[] actualChars = TwentyMethods.convertIntToCharArray(ints);
        //then
        assertEquals(0, actualChars.length);
    }

    //Task 3.1
    @Test
    void givenTwoIntsWithMaxAndMinValues_whenFindTheLargestOfTwoInts_thenReturnLargestOfTwoInts() {
        //given
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfTwoInts(a, b);
        //then
        assertEquals(2147483647, actualInteger);
    }

    //Task 3.1
    @Test
    void givenTwoDifferentInts_whenFindTheLargestOfTwoInts_thenReturnLargestOfTwoInts() {
        //given
        int a = 4;
        int b = -4;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfTwoInts(a, b);
        //then
        assertEquals(4, actualInteger);
    }

    //Task 3.1
    @Test
    void givenTwoEqualInts_whenFindTheLargestOfTwoInts_thenReturnLargestOfTwoInts() {
        //given
        int a = 4;
        int b = 4;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfTwoInts(a, b);
        //then
        assertEquals(4, actualInteger);
    }

    //Task 3.2
    @Test
    void givenTwoIntsWithMaxAndMinValues_whenFindTheLargestOfTwoIntsUsingTernaryOperator_thenReturnLargestOfTwoInts() {
        //given
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfTwoIntsUsingTernaryOperator(a, b);
        //then
        assertEquals(2147483647, actualInteger);
    }

    //Task 3.2
    @Test
    void givenTwoDifferentInts_whenFindTheLargestOfTwoIntsUsingTernaryOperator_thenReturnLargestOfTwoInts() {
        //given
        int a = 5;
        int b = -5;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfTwoIntsUsingTernaryOperator(a, b);
        //then
        assertEquals(5, actualInteger);
    }

    //Task 3.2
    @Test
    void givenTwoEqualInts_whenFindTheLargestOfTwoIntsUsingTernaryOperator_thenReturnLargestOfTwoInts() {
        //given
        int a = 5;
        int b = 5;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfTwoIntsUsingTernaryOperator(a, b);
        //then
        assertEquals(5, actualInteger);
    }

    //Task 3.3
    @Test
    void givenTwoIntsWithMaxAndMinValues_whenFindTheLargestOfTwoIntsUsingMathClass_thenReturnLargestOfTwoInts() {
        //given
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfTwoIntsUsingMathClass(a, b);
        //then
        assertEquals(2147483647, actualInteger);
    }

    //Task 3.3
    @Test
    void givenTwoDifferentInts_whenFindTheLargestOfTwoIntsUsingMathClass_thenReturnLargestOfTwoInts() {
        //given
        int a = 7;
        int b = -7;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfTwoIntsUsingMathClass(a, b);
        //then
        assertEquals(7, actualInteger);
    }

    //Task 3.3
    @Test
    void givenTwoEqualInts_whenFindTheLargestOfTwoIntsUsingMathClass_thenReturnLargestOfTwoInts() {
        //given
        int a = 7;
        int b = 7;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfTwoIntsUsingMathClass(a, b);
        //then
        assertEquals(7, actualInteger);
    }

    //Task 4.1
    @Test
    void givenThreeInts_whenFindTheLargestOfThreeInts_thenReturnLargestOfThreeInts() {
        //given
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        int c = 0;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfThreeInts(a, b, c);
        //then
        assertEquals(2147483647, actualInteger);
    }

    //Task 4.1
    @Test
    void givenThreeEqualInts_whenFindTheLargestOfThreeInts_thenReturnLargestOfThreeInts() {
        //given
        int a = 5;
        int b = 5;
        int c = 5;
        assertEquals(a, b, c);
        //when
        int actualInteger = TwentyMethods.findTheLargestOfThreeInts(a, b, c);
        //then
        assertEquals(5, actualInteger);
    }

    //Task 4.2
    @Test
    void givenThreeInts_whenFindTheLargestOfThreeIntsUsingTernaryOperator_thenReturnLargestOfThreeInts() {
        //given
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        int c = 0;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfThreeIntsUsingTernaryOperator(a, b, c);
        //then
        assertEquals(2147483647, actualInteger);
    }

    //Task 4.2
    @Test
    void givenThreeEqualInts_whenFindTheLargestOfThreeIntsUsingTernaryOperator_thenReturnLargestOfThreeInts() {
        //given
        int a = 7;
        int b = 7;
        int c = 7;
        assertEquals(a, b, c);
        //when
        int actualInteger = TwentyMethods.findTheLargestOfThreeIntsUsingTernaryOperator(a, b, c);
        //then
        assertEquals(7, actualInteger);
    }

    //Task 4.3
    @Test
    void givenThreeInts_whenFindTheLargestOfThreeIntsUsingMethodsThatFindTheLargestOfTwoInts_thenReturnLargestOfThreeInts() {
        //given
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        int c = 0;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfThreeIntsUsingMethodsThatFindTheLargestOfTwoInts(a, b, c);
        //then
        assertEquals(2147483647, actualInteger);
    }

    //Task 4.3
    @Test
    void givenThreeEqualInts_whenFindTheLargestOfThreeIntsUsingMethodsThatFindTheLargestOfTwoInts_thenReturnLargestOfThreeInts() {
        //given
        int a = 7;
        int b = 7;
        int c = 7;
        assertEquals(a, b, c);
        //when
        int actualInteger = TwentyMethods.findTheLargestOfThreeIntsUsingMethodsThatFindTheLargestOfTwoInts(a, b, c);
        //then
        assertEquals(7, actualInteger);
    }

    //Task 5.1
    @Test
    void givenFiveInts_whenFindTheLargestOfFiveInts_thenReturnLargestOfFiveInts() {
        //given
        int a = 1;
        int b = Integer.MIN_VALUE;
        int c = Integer.MAX_VALUE;
        int d = 0;
        int e = 20000000;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfFiveInts(a, b, c, d, e);
        //then
        assertEquals(2147483647, actualInteger);
    }

    //Task 5.1
    @Test
    void givenFiveIntsWithSomeEqualInts_whenFindTheLargestOfFiveInts_thenReturnLargestOfFiveInts() {
        //given
        int a = 2;
        int b = 100;
        int c = 100;
        int d = 2;
        int e = -12;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfFiveInts(a, b, c, d, e);
        //then
        assertEquals(100, actualInteger);
    }

    //Task 5.2
    @Test
    void givenFiveInts_whenFindTheLargestOfFiveIntsUsingMethodThatFindTheLargestOfThreeIntsUsingTernaryOperator_thenReturnLargestOfFiveInts() {
        //given
        int a = 1;
        int b = Integer.MIN_VALUE;
        int c = Integer.MAX_VALUE;
        int d = 0;
        int e = 20000000;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfFiveIntsUsingMethodThatFindTheLargestOfThreeIntsUsingTernaryOperator(a, b, c, d, e);
        //then
        assertEquals(2147483647, actualInteger);
    }

    //Task 5.2
    @Test
    void givenFiveIntsWithSomeEqualInts_whenFindTheLargestOfFiveIntsUsingMethodThatFindTheLargestOfThreeIntsUsingTernaryOperator_thenReturnLargestOfFiveInts() {
        //given
        int a = 2;
        int b = 100;
        int c = 100;
        int d = 2;
        int e = -12;
        //when
        int actualInteger = TwentyMethods.findTheLargestOfFiveIntsUsingMethodThatFindTheLargestOfThreeIntsUsingTernaryOperator(a, b, c, d, e);
        //then
        assertEquals(100, actualInteger);
    }

    //Task 6
    @Test
    void givenCharArray_whenConvertCharArrayToString_thenReturnStringOfChars() {
        //given
        char[] chars = new char[]{'a', 'b', 'д', 'ц', '\'', '&', '.'};
        //when
        String actualString = TwentyMethods.convertCharArrayToString(chars);
        //then
        assertEquals("abдц\'&.", actualString);
    }

    //Task 6
    @Test
    void givenEmptyCharArray_whenConvertCharArrayToString_thenReturnEmptyString() {
        //given
        char[] chars = new char[]{};
        //when
        String actualString = TwentyMethods.convertCharArrayToString(chars);
        //then
        assertTrue(actualString.isEmpty());
    }

    //Task 6
    @Test
    void givenNullCharArray_whenConvertCharArrayToString_thenReturnEmptyString() {
        //given
        char[] chars = null;
        //when
        String actualString = TwentyMethods.convertCharArrayToString(chars);
        //then
        assertTrue(actualString.isEmpty());
    }

    //Task 7
    @Test
    void givenIntArray_whenFindIndexOfIntegersThatMatchesWithInt_thenReturnFirstMatchingIndexButNotReturnSecondMatching() {
        //given
        int[] integers = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 2, 3, 100};
        //when
        int actualIndex = TwentyMethods.findIndexOfIntegersThatMatchesWithInt(integers);
        //then
        assertEquals(2, actualIndex);
        assertNotEquals(3, actualIndex);
    }

    //Task 7
    @Test
    void givenEmptyIntArray_whenFindIndexOfIntegersThatMatchesWithInt_thenReturnMinusOne() {
        //given
        int[] integers = new int[]{};
        //when
        int actualIndex = TwentyMethods.findIndexOfIntegersThatMatchesWithInt(integers);
        //then
        assertEquals(-1, actualIndex);
    }

    //Task 7
    @Test
    void givenNullIntArray_whenFindIndexOfIntegersThatMatchesWithInt_thenReturnMinusOne() {
        //given
        int[] integers = null;
        //when
        int actualIndex = TwentyMethods.findIndexOfIntegersThatMatchesWithInt(integers);
        //then
        assertEquals(-1, actualIndex);
    }

    //Task 8
    @Test
    void givenIntAndIntArrayWithMatchingValue_whenFindValueOfIndexInIntArrayThatMatchesWithInt_thenReturnFirstIndexWithMatchingValue() {
        //given
        int[] integers = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 6, 8, 100};
        int intToFind = Integer.MAX_VALUE;
        //when
        int actualIndex = TwentyMethods.findValueOfIndexInIntArrayThatMatchesWithInt(integers, intToFind);
        //then
        assertEquals(1, actualIndex);
    }

    //Task 8
    @Test
    void givenIntAndIntArrayWithMatchingValue_whenFindValueOfIndexInIntArrayThatMatchesWithInt_thenReturnFirstIndexWithMatchingValueButNotTheOtherNext() {
        //given
        int[] integers = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 6, 6, 6};
        int intToFind = 6;
        //when
        int actualIndex = TwentyMethods.findValueOfIndexInIntArrayThatMatchesWithInt(integers, intToFind);
        //then
        assertEquals(2, actualIndex);
        assertNotEquals(3, actualIndex);
        assertNotEquals(4, actualIndex);
    }

    //Task 8
    @Test
    void givenIntAndIntArrayWithNonMatchingValue_whenFindValueOfIndexInIntArrayThatMatchesWithInt_thenReturnMinusOne() {
        //given
        int[] integers = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 5, 6, 100};
        int intToFind = 7;
        //when
        int actualIndex = TwentyMethods.findValueOfIndexInIntArrayThatMatchesWithInt(integers, intToFind);
        //then
        assertEquals(-1, actualIndex);
    }

    //Task 8
    @Test
    void givenIntAndEmptyIntArray_whenFindValueOfIndexInIntArrayThatMatchesWithInt_thenReturnMinusOne() {
        //given
        int[] integers = new int[]{};
        int intToFind = 100;
        //when
        int actualIndex = TwentyMethods.findValueOfIndexInIntArrayThatMatchesWithInt(integers, intToFind);
        //then
        assertEquals(-1, actualIndex);
    }

    //Task 8
    @Test
    void givenIntAndNullIntArray_whenFindValueOfIndexInIntArrayThatMatchesWithInt_thenReturnMinusOne() {
        //given
        int[] integers = null;
        int intToFind = 100;
        //when
        int actualIndex = TwentyMethods.findValueOfIndexInIntArrayThatMatchesWithInt(integers, intToFind);
        //then
        assertEquals(-1, actualIndex);
    }

    //Test 9
    @Test
    void givenMatchIntIndexAndIntArray_whenFindIndexOfIntegersFromTheEndThatMatchesWithItsValue_thenReturnFirstMatchingIndexButNotTheOtherNext() {
        //given
        int[] integers = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 6, 5, 6};
        int intToFind = 6;
        //when
        int actualIndex = TwentyMethods.findIndexOfIntegersFromTheEndThatMatchesWithItsValue(integers, intToFind);
        //then
        assertEquals(4, actualIndex);
        assertNotEquals(2, actualIndex);
    }

    //Test 9
    @Test
    void givenIntAndIntArray_whenFindIndexOfIntegersFromTheEndThatMatchesWithItsValue_thenReturnMinusOne() {
        //given
        int[] integers = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 6, 5, 6};
        int intToFind = 100;
        //when
        int actualIndex = TwentyMethods.findIndexOfIntegersFromTheEndThatMatchesWithItsValue(integers, intToFind);
        //then
        assertEquals(-1, actualIndex);
    }

    //Test 9
    @Test
    void givenIntAndEmptyIntArray_whenFindIndexOfIntegersFromTheEndThatMatchesWithItsValue_thenReturnMinusOne() {
        //given
        int[] integers = new int[]{};
        int intToFind = 100;
        //when
        int actualIndex = TwentyMethods.findIndexOfIntegersFromTheEndThatMatchesWithItsValue(integers, intToFind);
        //then
        assertEquals(-1, actualIndex);
    }

    //Test 9
    @Test
    void givenIntAndNullIntArray_whenFindValueOfIndexInIntArrayThatMatchesWithIntStartsFromTheEnd_thenReturnMinusOne() {
        //given
        int[] integers = null;
        int intToFind = 100;
        //when
        int actualIndex = TwentyMethods.findIndexOfIntegersFromTheEndThatMatchesWithItsValue(integers, intToFind);
        //then
        assertEquals(-1, actualIndex);
    }

    //Task 10.1
    @Test
    void givenInt_whenFindFactorial_thenReturnFactorialOfGivenInt() {
        //given
        int intToFactorial = 50;
        BigInteger expectedInt = new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");
        //when
        BigInteger actualValue = TwentyMethods.findFactorial(intToFactorial);
        //then
        assertEquals(expectedInt, actualValue);
    }

    //Task 10.1
    @Test
    void givenIntWithNegativeValue_whenFindFactorial_thenReturnMinusOne() {
        //given
        int intToFactorial = -5;
        BigInteger expectedInt = new BigInteger("-1");
        //when
        BigInteger actualValue = TwentyMethods.findFactorial(intToFactorial);
        //then
        assertEquals(expectedInt, actualValue);
    }

    //Task 10.1
    @Test
    void givenIntWithValueGreaterThan50_whenFindFactorial_thenReturnMinusOne() {
        //given
        int intToFactorial = 51;
        BigInteger expectedInt = new BigInteger("-1");
        //when
        BigInteger actualValue = TwentyMethods.findFactorial(intToFactorial);
        //then
        assertEquals(expectedInt, actualValue);
    }

    //Task 10.1
    @Test
    void givenIntWithZeroIntValue_whenFindFactorial_thenReturnOne() {
        //given
        int intToFactorial = 0;
        BigInteger expectedInt = new BigInteger("1");
        //when
        BigInteger actualValue = TwentyMethods.findFactorial(intToFactorial);
        //then
        assertEquals(expectedInt, actualValue);
    }

    //Task 10.2
    @Test
    void givenInt_whenFindFactorialByRecursion_thenReturnFactorialOfGivenInt() {
        //given
        int intToFactorial = 50;
        BigInteger expectedInt = new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");
        //when
        BigInteger actualValue = TwentyMethods.findFactorialByRecursion(intToFactorial);
        //then
        assertEquals(expectedInt, actualValue);
    }

    //Task 10.2
    @Test
    void givenIntWithNegativeValue_whenFindFactorialByRecursion_thenReturnMinusOne() {
        //given
        int intToFactorial = -5;
        BigInteger expectedInt = new BigInteger("-1");
        //when
        BigInteger actualValue = TwentyMethods.findFactorialByRecursion(intToFactorial);
        //then
        assertEquals(expectedInt, actualValue);
    }

    //Task 10.2
    @Test
    void givenIntWithValueGreaterThan50_whenFindFactorialByRecursion_thenReturnMinusOne() {
        //given
        int intToFactorial = 51;
        BigInteger expectedInt = new BigInteger("-1");
        //when
        BigInteger actualValue = TwentyMethods.findFactorialByRecursion(intToFactorial);
        //then
        assertEquals(expectedInt, actualValue);
    }

    //Task 10.2
    @Test
    void givenIntWithZeroIntValue_whenFindFactorialByRecursion_thenReturnOne() {
        //given
        int intToFactorial = 0;
        BigInteger expectedInt = new BigInteger("1");
        //when
        BigInteger actualValue = TwentyMethods.findFactorialByRecursion(intToFactorial);
        //then
        assertEquals(expectedInt, actualValue);
    }

    //Task 11
    @Test
    void givenLeapYear_whenCheckIfYearIsLeap_thenReturnTrue() {
        //given
        int year = 2008;
        //when
        boolean actualLeap = TwentyMethods.isLeap(year);
        //then
        assertTrue(actualLeap);
    }

    //Task 11
    @Test
    void givenNotLeapYear_whenCheckIfYearIsLeap_thenReturnTrue() {
        //given
        int year = 1900;
        //when
        boolean actualLeap = TwentyMethods.isLeap(year);
        //then
        assertFalse(actualLeap);
    }

    //Task 11
    @Test
    void givenOddYear_whenCheckIfYearIsLeap_thenReturnTrue() {
        //given
        int year = 1801;
        //when
        boolean actualLeap = TwentyMethods.isLeap(year);
        //then
        assertFalse(actualLeap);
    }

    //Task 11
    @Test
    void givenYearBC_whenCheckIfYearIsLeap_thenReturnTrue() {
        //given
        int year = -1200;
        //when
        boolean actualLeap = TwentyMethods.isLeap(year);
        //then
        assertTrue(actualLeap);
    }

    //Task 11
    @Test
    void givenZeroYear_whenCheckIfYearIsLeap_thenReturnTrue() {
        //given
        int year = 0;
        //when
        boolean actualLeap = TwentyMethods.isLeap(year);
        //then
        assertTrue(actualLeap);
    }

    //Test 12
    @Test
    void givenIntAndIntArray_whenFindValuesWhichAreDivisibleByAGivenIntWithoutARemainder_thenReturnListOfFoundValues() {
        //given
        int[] integersArray = new int[]{Integer.MIN_VALUE, 2, 3, 4, 5, 6, 7, 8, 9, Integer.MAX_VALUE};
        int integer = 4;
        List<Integer> expectedList = List.of(-2147483648, 4, 8);
        //when
        List<Integer> actualList = TwentyMethods.findValuesWhichAreDivisibleByANumberWithoutARemainder(integersArray, integer);
        //then
        assertEquals(expectedList, actualList);
    }

    //Test 12
    @Test
    void givenNonMultipleIntAndIntArray_whenFindValuesWhichAreDivisibleByAGivenIntWithoutARemainder_thenReturnEmptyList() {
        //given
        int[] integersArray = new int[]{Integer.MIN_VALUE, 2, 3, 4, 5, 6, 7, 8, 9, Integer.MAX_VALUE};
        int integer = 10;
        //when
        List<Integer> actualList = TwentyMethods.findValuesWhichAreDivisibleByANumberWithoutARemainder(integersArray, integer);
        //then
        assertTrue(actualList.isEmpty());
    }

    //Test 12
    @Test
    void givenIntAndNullIntArray_whenFindValuesWhichAreDivisibleByAGivenIntWithoutARemainder_thenReturnEmptyList() {
        //given
        int[] integersArray = null;
        int integer = 3;
        //when
        List<Integer> actualList = TwentyMethods.findValuesWhichAreDivisibleByANumberWithoutARemainder(integersArray, integer);
        //then
        assertTrue(actualList.isEmpty());
    }

    //Test 12
    @Test
    void givenZeroIntAndNullIntArray_whenFindValuesWhichAreDivisibleByAGivenIntWithoutARemainder_thenReturnEmptyList() {
        //given
        int[] integers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int integer = 0;
        //when
        List<Integer> actualList = TwentyMethods.findValuesWhichAreDivisibleByANumberWithoutARemainder(integers, integer);
        //then
        assertTrue(actualList.isEmpty());
    }

    //Test 12
    @Test
    void givenNegativeIntAndIntArray_whenFindValuesWhichAreDivisibleByAGivenIntWithoutARemainder_thenReturnEmptyList() {
        //given
        int[] integersArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int integer = Integer.MIN_VALUE;
        //when
        List<Integer> actualList = TwentyMethods.findValuesWhichAreDivisibleByANumberWithoutARemainder(integersArray, integer);
        //then
        assertTrue(actualList.isEmpty());
    }

    //Test 12
    @Test
    void givenIntAndEmptyIntArray_whenFindValuesWhichAreDivisibleByAGivenIntWithoutARemainder_thenReturnEmptyList() {
        //given
        int[] integersArray = new int[]{};
        int integer = 3;
        List<Integer> expectedList = new ArrayList<>();
        //when
        List<Integer> actualList = TwentyMethods.findValuesWhichAreDivisibleByANumberWithoutARemainder(integersArray, integer);
        //then
        assertEquals(expectedList, actualList);
    }

    //Task 13.1
    @Test
    void givenIntArray_whenSortArrayInAscendingOrderWithBubbleSortAlgorithm_thenReturnSortedArrayInAscendingOrder() {
        //given
        int[] integers = new int[]{Integer.MAX_VALUE, 2, 9, Integer.MIN_VALUE, 5, 0, 1, -745632, 33627, -7588};
        int[] expectedIntegers = new int[]{-2147483648, -745632, -7588, 0, 1, 2, 5, 9, 33627, 2147483647};
        //when
        int[] actualIntegers = TwentyMethods.sortArrayInAscendingOrderWithBubbleSortAlgorithm(integers);
        //then
        assertArrayEquals(expectedIntegers, actualIntegers);
    }

    //Task 13.1
    @Test
    void givenEmptyIntArray_whenSortArrayInAscendingOrderWithBubbleSortAlgorithm_thenReturnEmptyArray() {
        //given
        int[] integers = new int[]{};
        //when
        int[] actualIntegers = TwentyMethods.sortArrayInAscendingOrderWithBubbleSortAlgorithm(integers);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 13.1
    @Test
    void givenNullIntArray_whenSortArrayInAscendingOrderWithBubbleSortAlgorithm_thenReturnEmptyArray() {
        //given
        int[] integers = null;
        //when
        int[] actualIntegers = TwentyMethods.sortArrayInAscendingOrderWithBubbleSortAlgorithm(integers);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 13.2
    @Test
    //Insertion sort
    void givenIntArray_whenSortArrayInAscendingOrderWithInsertionSortAlgorithm_thenReturnSortedArrayInAscendingOrder() {
        //given
        int[] integers = new int[]{Integer.MAX_VALUE, 2, 9, Integer.MIN_VALUE, 5, 0, 1, -745632, 33627, -7588};
        int[] expectedIntegers = new int[]{-2147483648, -745632, -7588, 0, 1, 2, 5, 9, 33627, 2147483647};
        //when
        int[] actualIntegers = TwentyMethods.sortArrayInAscendingOrderWithInsertionSortAlgorithm(integers);
        //then
        assertArrayEquals(expectedIntegers, actualIntegers);
    }

    //Task 13.2
    @Test
    void givenEmptyIntArray_whenSortArrayInAscendingOrderWithInsertionSortAlgorithm_thenReturnEmptyArray() {
        //given
        int[] integers = new int[]{};
        //when
        int[] actualIntegers = TwentyMethods.sortArrayInAscendingOrderWithInsertionSortAlgorithm(integers);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 13.2
    @Test
    void givenNullIntArray_whenSortArrayInAscendingOrderWithInsertionSortAlgorithm_thenReturnEmptyArray() {
        //given
        int[] integers = null;
        //when
        int[] actualIntegers = TwentyMethods.sortArrayInAscendingOrderWithInsertionSortAlgorithm(integers);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 14.1
    @Test
    void givenByteArrayWithSomeEqualElements_whenFindEqualElementsInByteArrayWithPreliminarySorting_thenReturnTrue() {
        //given
        byte[] bytes = new byte[]{-65, 2, 3, 78, 2, 6, 82, 127};
        //when
        boolean actualBoolean = TwentyMethods.findEqualElementsInByteArrayWithPreliminarySorting(bytes);
        //then
        assertTrue(actualBoolean);
    }

    //Task 14.1
    @Test
    void givenByteArrayWithoutEqualElements_whenFindEqualElementsInByteArrayWithPreliminarySorting_thenReturnFalse() {
        //given
        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        //when
        boolean actualBoolean = TwentyMethods.findEqualElementsInByteArrayWithPreliminarySorting(bytes);
        //then
        assertFalse(actualBoolean);
    }

    //Task 14.1
    @Test
    void givenEmptyByteArray_whenFindEqualElementsInByteArrayWithPreliminarySorting_thenReturnFalse() {
        //given
        byte[] bytes = new byte[]{};
        //when
        boolean actualBoolean = TwentyMethods.findEqualElementsInByteArrayWithPreliminarySorting(bytes);
        //then
        assertFalse(actualBoolean);
    }

    //Task 14.1
    @Test
    void givenNullByteArray_whenFindEqualElementsInByteArrayWithPreliminarySorting_thenReturnFalse() {
        //given
        byte[] bytes = null;
        //when
        boolean actualBoolean = TwentyMethods.findEqualElementsInByteArrayWithPreliminarySorting(bytes);
        //then
        assertFalse(actualBoolean);
    }

    //Task 14.2
    @Test
    //Second method
    void givenByteArrayToOtherMethod_whenFindEqualElementsInByteArrayWithLoopingThroughArrayTwice_thenReturnTrueIfEqualElementsFound() {
        //given
        byte[] bytes = new byte[]{-65, 2, 3, 78, 2, 6, 82, 127};
        //when
        boolean actualBoolean = TwentyMethods.findEqualElementsInByteArrayWithLoopingThroughArrayTwice(bytes);
        //then
        assertTrue(actualBoolean);
    }

    //Task 14.2
    @Test
    void givenByteArrayWithoutEqualElements_whenFindEqualElementsInByteArrayWithLoopingThroughArrayTwice_thenReturnFalse() {
        //given
        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        //when
        boolean actualBoolean = TwentyMethods.findEqualElementsInByteArrayWithLoopingThroughArrayTwice(bytes);
        //then
        assertFalse(actualBoolean);
    }

    //Task 14.2
    @Test
    void givenEmptyByteArray_whenFindEqualElementsInByteArrayWithLoopingThroughArrayTwice_thenReturnFalse() {
        //given
        byte[] bytes = new byte[]{};
        //when
        boolean actualBoolean = TwentyMethods.findEqualElementsInByteArrayWithLoopingThroughArrayTwice(bytes);
        //then
        assertFalse(actualBoolean);
    }

    //Task 14.2
    @Test
    void givenNullByteArray_whenFindEqualElementsInByteArrayWithLoopingThroughArrayTwice_thenReturnFalse() {
        //given
        byte[] bytes = null;
        //when
        boolean actualBoolean = TwentyMethods.findEqualElementsInByteArrayWithLoopingThroughArrayTwice(bytes);
        //then
        assertFalse(actualBoolean);
    }

    //Task 15
    @Test
    void givenTwoIntArraysWithTheSameLength_whenGetIntArrayOfMultipliedValues_thenReturnIntArrayOfMultipleValues() {
        //given
        int[] integersFirstArray = new int[]{1, 3, 5, 7, 8, 9};
        int[] integersSecondArray = new int[]{1, 2, 4, 5, 6, 7};
        int[] expectedIntegers = new int[]{1, 6, 20, 35, 48, 63};
        //when
        int[] actualIntegers = TwentyMethods.getIntArrayOfMultipliedValues(integersFirstArray, integersSecondArray);
        //then
        assertArrayEquals(expectedIntegers, actualIntegers);
    }

    //Task 15
    @Test
    void givenTwoIntArraysWithLongerFirst_whenGetIntArrayOfMultipliedValues_thenReturnEmptyArray() {
        //given
        int[] integersFirstArray = new int[]{1, 3, 5};
        int[] integersSecondArray = new int[]{1, 2, 4, 5, 6, 7};
        //when
        int[] actualIntegers = TwentyMethods.getIntArrayOfMultipliedValues(integersFirstArray, integersSecondArray);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 15
    @Test
    void givenTwoIntArraysWithLongerSecond_whenGetIntArrayOfMultipliedValues_thenReturnEmptyArray() {
        //given
        int[] integersFirstArray = new int[]{1, 2, 4, 5, 6, 7};
        int[] integersSecondArray = new int[]{1, 3, 5};
        //when
        int[] actualIntegers = TwentyMethods.getIntArrayOfMultipliedValues(integersFirstArray, integersSecondArray);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 15
    @Test
    void givenEmptyFirstArrayAndValuesToSecondIntArray_whenGetIntArrayOfMultipliedValues_thenReturnEmptyArray() {
        //given
        int[] integersFirstArray = new int[]{};
        int[] integersSecondArray = new int[]{1, 2, 4, 5, 6, 7};
        //when
        int[] actualIntegers = TwentyMethods.getIntArrayOfMultipliedValues(integersFirstArray, integersSecondArray);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 15
    @Test
    void givenEmptySecondIntArrayAndValuesToFirstIntArray_whenGetIntArrayOfMultipliedValues_thenReturnEmptyArray() {
        //given
        int[] integersFirstArray = new int[]{1, 2, 4, 5, 6, 7};
        int[] integersSecondArray = new int[]{};
        //when
        int[] actualIntegers = TwentyMethods.getIntArrayOfMultipliedValues(integersFirstArray, integersSecondArray);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 15
    @Test
    void givenNullInFirstArrayAndValuesToSecondIntArray_whenGetIntArrayOfMultipliedValues_thenReturnEmptyArray() {
        //given
        int[] integersFirstArray = null;
        int[] integersSecondArray = new int[]{1, 2, 4, 5, 6, 7};
        //when
        int[] actualIntegers = TwentyMethods.getIntArrayOfMultipliedValues(integersFirstArray, integersSecondArray);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 15
    @Test
    void givenNullInSecondArrayAndValuesToFirstIntArray_whenGetIntArrayOfMultipliedValues_thenReturnEmptyArray() {
        //given
        int[] integersFirstArray = new int[]{1, 2, 4, 5, 6, 7};
        int[] integersSecondArray = null;
        //when
        int[] actualIntegers = TwentyMethods.getIntArrayOfMultipliedValues(integersFirstArray, integersSecondArray);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 15
    @Test
    void givenTwoIntArraysWithTheSameLengthAndElementsWithMaxAndMinValues_whenGetIntArrayOfMultipliedValues_thenReturnEmptyArray() {
        //given
        int[] integers1 = new int[]{1, 3, 5, 7, 8, Integer.MAX_VALUE};
        int[] integers2 = new int[]{1, 2, 4, 5, 6, Integer.MIN_VALUE};
        //when
        int[] actualIntegers = TwentyMethods.getIntArrayOfMultipliedValues(integers1, integers2);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 16
    @Test
    void givenTwoEqualIntArrays_whenGetArrayOfNonMatchingIndexes_thenReturnEmptyArray() {
        //given
        int[] integers1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] integers2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //when
        List<Integer> actualIntegers = TwentyMethods.getNonMatchingIndexes(integers1, integers2);
        //then
        assertEquals(0, actualIntegers.size());
    }

    //Task 16
    @Test
    void givenTwoIntArraysWithDifferentValues_whenGetArrayOfNonMatchingIndexes_thenReturnArrayOfElementsThatDontMatch() {
        //given
        int[] integers1 = new int[]{1, 5, 3, 7, 5, 6, 2, 8, Integer.MAX_VALUE, 10};
        int[] integers2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, Integer.MIN_VALUE, 10};
        List<Integer> expectedIntegers = List.of(5, 7, 2, 2147483647);
        //when
        List<Integer> actualIntegers = TwentyMethods.getNonMatchingIndexes(integers1, integers2);
        //then
        assertEquals(expectedIntegers, actualIntegers);
    }

    //Task 16
    @Test
    void givenTwoIntArraysWithShorterFirstArray_whenCompareElementsOfTwoArrays_thenReturnArrayOfElementsThatDontMatch() {
        //given
        int[] integers1 = new int[]{5, 4, 3, 2, 1, 6, 7};
        int[] integers2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> expectedIntegers = List.of(5, 4, 2, 1, 8, 9, 10);
        //when
        List<Integer> actualIntegers = TwentyMethods.getNonMatchingIndexes(integers1, integers2);
        //then
        assertEquals(expectedIntegers, actualIntegers);
    }

    //Task 16
    @Test
    void givenTwoIntArraysWithShorterSecondArray_whenCompareElementsOfTwoArrays_thenReturnArrayOfElementsThatDontMatch() {
        //given
        int[] integers1 = new int[]{Integer.MIN_VALUE, 2, 3, 4, 5, 6, 7, 8, Integer.MAX_VALUE, 10};
        int[] integers2 = new int[]{5, 4, 3, 2, 7};
        List<Integer> expectedIntegers = List.of(-2147483648, 2, 4, 5, 6, 7, 8, 2147483647, 10);
        //when
        List<Integer> actualIntegers = TwentyMethods.getNonMatchingIndexes(integers1, integers2);
        //then
        assertEquals(expectedIntegers, actualIntegers);
    }

    //Task 16
    @Test
    void givenTwoIntArraysWithFirstEmptyArray_whenCompareElementsOfTwoArrays_thenReturnArrayOfElementsThatDontMatch() {
        //given
        int[] integers1 = new int[]{};
        int[] integers2 = new int[]{5, 4, 3, 2, 7};
        List<Integer> expectedIntegers = List.of(5, 4, 3, 2, 7);
        //when
        List<Integer> actualIntegers = TwentyMethods.getNonMatchingIndexes(integers1, integers2);
        //then
        assertEquals(expectedIntegers, actualIntegers);
    }

    //Task 16
    @Test
    void givenTwoIntArraysWithSecondEmptyArray_whenCompareElementsOfTwoArrays_thenReturnArrayOfElementsThatDontMatch() {
        //given
        int[] integers1 = new int[]{5, 4, 3, 2, 7};
        int[] integers2 = new int[]{};
        List<Integer> expectedIntegers = List.of(5, 4, 3, 2, 7);
        //when
        List<Integer> actualIntegers = TwentyMethods.getNonMatchingIndexes(integers1, integers2);
        //then
        assertEquals(expectedIntegers, actualIntegers);
    }

    //Task 16
    @Test
    void givenTwoIntArraysWithFirstNullArray_whenCompareElementsOfTwoArrays_thenReturnArrayOfElementsThatDontMatch() {
        //given
        int[] integers1 = null;
        int[] integers2 = new int[]{5, 4, 3, 2, 7};
        //when
        List<Integer> actualIntegers = TwentyMethods.getNonMatchingIndexes(integers1, integers2);
        //then
        assertEquals(0, actualIntegers.size());
    }

    //Task 16
    @Test
    void givenTwoIntArraysWithSecondNullArray_whenCompareElementsOfTwoArrays_thenReturnArrayOfElementsThatDontMatch() {
        //given
        int[] integers1 = new int[]{5, 4, 3, 2, 7};
        int[] integers2 = null;
        //when
        List<Integer> actualIntegers = TwentyMethods.getNonMatchingIndexes(integers1, integers2);
        //then
        assertEquals(0, actualIntegers.size());
    }

    //Task 17
    @Test
    void givenIntArray_whenGetArrayOfIntegersWithValuesInReverseOrder_thenReturnArrayOfElementsInReverseOrder() {
        //given
        int[] integers = new int[]{1, Integer.MIN_VALUE, 3, 4, 5, 6, 7, Integer.MAX_VALUE, 9, 80};
        int[] expectedIntegers = new int[]{80, 9, Integer.MAX_VALUE, 7, 6, 5, 4, 3, Integer.MIN_VALUE, 1};
        //when
        int[] actualIntegers = TwentyMethods.getArrayOfIntegersWithValuesInReverseOrder(integers);
        //then
        assertArrayEquals(expectedIntegers, actualIntegers);
    }

    //Task 17
    @Test
    void givenEmptyIntArray_whenGetArrayOfIntegersWithValuesInReverseOrder_thenReturnEmptyArray() {
        //given
        int[] integers = new int[]{};
        //when
        int[] actualIntegers = TwentyMethods.getArrayOfIntegersWithValuesInReverseOrder(integers);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 17
    @Test
    void givenNullIntArray_whenGetArrayOfIntegersWithValuesInReverseOrder_thenReturnEmptyArray() {
        //given
        int[] integers = null;
        //when
        int[] actualIntegers = TwentyMethods.getArrayOfIntegersWithValuesInReverseOrder(integers);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 18
    @Test
    void givenMaximumSizeOfIntegersThatReturnsResultWithLowerAndUpperBorder_whenGetRandomArrayWithBounds_thenReturnIntegersFromLowerToUpperBoundsWithCertainLength() throws Exception {
        //given
        int sizeOfIntArray = 715827882;
        int lowerBorder = -10;
        int upperBorder = 7;
        //when
        int[] actualIntegers = TwentyMethods.getRandomArrayWithBounds(sizeOfIntArray, lowerBorder, upperBorder);
        //then
        assertEquals(715827882, actualIntegers.length);
    }

    //Task 18
    @Test
    void givenSizeOfIntegersWithLowerBorderLargerThenUpperBorder_whenGetRandomArrayWithBounds_thenReturnEmptyArray() throws Exception {
        //given
        int sizeOfIntArray = 15;
        int lowerBorder = 9;
        int upperBorder = 7;
        //when
        int[] actualIntegers = TwentyMethods.getRandomArrayWithBounds(sizeOfIntArray, lowerBorder, upperBorder);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 18
    @Test
    void givenSizeOfIntegersWithEqualBorders_whenGetRandomArrayWithBounds_thenReturnEmptyArray() throws Exception {
        //given
        int sizeOfIntArray = 15;
        int lowerBorder = 9;
        int upperBorder = 9;
        //when
        int[] actualIntegers = TwentyMethods.getRandomArrayWithBounds(sizeOfIntArray, lowerBorder, upperBorder);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 18
    @Test
    // an OutOfMemoryError occurs in this test
    void givenIntegersWithMaximumValueOfArraySize_whenGetRandomArrayWithBounds_thenReturnIntegersFromLowerToUpperBoundsWithCertainLength() throws Exception {
        //given
        int maxSizeOfArray = Integer.MAX_VALUE;
        int lowerBorder = 2;
        int upperBorder = 25;
        //when
        Exception exception = assertThrows(Exception.class, () -> {
            TwentyMethods.getRandomArrayWithBounds(maxSizeOfArray, lowerBorder, upperBorder);
        });
        //then
        String expectedMessage = "Size of array is larger than program can handle";
        String actualMessage = exception.getMessage();
        //then
        assertTrue(expectedMessage.contains(actualMessage));
    }

    //Task 18
    @Test
    void givenIntegersWithMaximumArraySize_whenGetRandomArrayWithBounds_thenReturnIntegersFromLowerToUpperBoundsWithCertainLength() throws Exception {
        //given
        Runtime r = Runtime.getRuntime();
        int maxSizeOfArray = (int) ((r.maxMemory() / 4) * 0.95);
        int lowerBorder = 2;
        int upperBorder = 25;
        //when
        int[] actualIntegers = TwentyMethods.getRandomArrayWithBounds(maxSizeOfArray, lowerBorder, upperBorder);
        //then
        assertEquals(maxSizeOfArray, actualIntegers.length);
    }

    //Task 18
    @Test
    void givenNegativeSizeOfIntegersWithLowerAndUpperBorder_whenGetRandomArrayWithBounds_thenReturnEmptyArray() throws Exception {
        //given
        int sizeOfIntArray = -15;
        int lowerBorder = 10;
        int upperBorder = 7;
        //when
        int[] actualIntegers = TwentyMethods.getRandomArrayWithBounds(sizeOfIntArray, lowerBorder, upperBorder);
        //then
        assertEquals(0, actualIntegers.length);
    }

    //Task 18
    @Test
    void givenSizeOfIntegersWithLowerBorderLargerThenUpperBorder_whenGetRandomArrayWithBounds_thenReturnIntegers() throws Exception {
        //given
        int sizeOfIntArray = 7000;
        int lowerBorder = 0;
        int upperBorder = 7;
        //when
        int[] actualIntegers = TwentyMethods.getRandomArrayWithBounds(sizeOfIntArray, lowerBorder, upperBorder);
        //then
        for (int integer : actualIntegers) {
            assertTrue(integer >= lowerBorder);
            assertTrue(integer <= upperBorder);
        }
    }

    // Task 19.1
    @Test
    void givenTwoArraysOfChars_whenCheckIfIsSecondInFirstWithUsingLoops_thenReturnTrue() {
        char[] chars1 = {'a', 'b', 'c', 'd'};
        char[] chars2 = {'b', 'c'};
        boolean isSequence = TwentyMethods.isSecondInFirst(chars1, chars2);
        assertTrue(isSequence);
    }

    // Task 19.1
    @Test
    void givenTwoArraysOfCharsWithCyrillicAndSpecialSymbol_whenCheckIfIsSecondInFirstWithUsingLoops_thenReturnTrue() {
        char[] chars1 = "Привет медвед!))".toCharArray();
        char[] chars2 = "вед!)".toCharArray();
        boolean isSequence = TwentyMethods.isSecondInFirst(chars1, chars2);
        assertTrue(isSequence);
    }

    // Task 19.1
    @Test
    void givenTwoArraysOfCharsWithNotMatchingSymbol_whenCheckIfIsSecondInFirstWithUsingLoops_thenReturnTrue() {
        char[] chars1 = "Привет медвед!))".toCharArray();
        char[] chars2 = "Дарова".toCharArray();
        boolean isSequence = TwentyMethods.isSecondInFirst(chars1, chars2);
        assertFalse(isSequence);
    }

    //Task 19.1
    @Test
    void givenTwoArraysOfCharsWithFirstNull_whenCheckIfIsSecondInFirstWithUsingLoops_thenReturnFalse() {
        //given
        char[] chars1 = null;
        char[] chars2 = {'a', 'b', 'c', 'd'};
        //when
        boolean isSequence = TwentyMethods.isSecondInFirst(chars1, chars2);
        //then
        assertFalse(isSequence);
    }

    //Task 19.1
    @Test
    void givenTwoArraysOfCharsWithSecondNull_whenCheckIfIsSecondInFirstWithUsingLoops_thenReturnFalse() {
        //given
        char[] chars1 = {'a', 'b', 'c', 'd'};
        char[] chars2 = null;
        //when
        boolean isSequence = TwentyMethods.isSecondInFirst(chars1, chars2);
        //then
        assertFalse(isSequence);
    }

    //Task 19.1
    @Test
    void givenTwoArraysOfCharsWithFirstEmpty_whenCheckIfIsSecondInFirstWithUsingLoops_thenReturnFalse() {
        //given
        char[] chars1 = {};
        char[] chars2 = {'a', 'b', 'c', 'd'};
        //when
        boolean isSequence = TwentyMethods.isSecondInFirst(chars1, chars2);
        //then
        assertFalse(isSequence);
    }

    //Task 19.1
    @Test
    void givenTwoArraysOfCharsWithSecondEmpty_whenCheckIfIsSecondInFirstWithUsingLoops_thenReturnTrue() {
        //given
        char[] chars1 = {'a', 'b', 'c', 'd'};
        char[] chars2 = {};
        //when
        boolean isSequence = TwentyMethods.isSecondInFirst(chars1, chars2);
        //then
        assertTrue(isSequence);
    }

    // Task 19.2
    @Test
    void givenTwoArraysOfChars_whenCheckIfIsSecondInFirstWithUsingStrings_thenReturnTrue() {
        char[] chars1 = {'a', 'b', 'c', 'd'};
        char[] chars2 = {'b', 'c'};
        boolean isSequence = TwentyMethods.isSecondInFirstWithUsingStrings(chars1, chars2);
        assertTrue(isSequence);
    }

    // Task 19.2
    @Test
    void givenTwoArraysOfCharsWithCyrillicAndSpecialSymbol_whenCheckIfIsSecondInFirstWithUsingStrings_thenReturnTrue() {
        char[] chars1 = "Привет медвед!))".toCharArray();
        char[] chars2 = "вед!)".toCharArray();
        boolean isSequence = TwentyMethods.isSecondInFirstWithUsingStrings(chars1, chars2);
        assertTrue(isSequence);
    }

    // Task 19.2
    @Test
    void givenTwoArraysOfCharsWithNotMatchingSymbol_whenCheckIfIsSecondInFirstWithUsingStrings_thenReturnFalse() {
        char[] chars1 = "Привет медвед!))".toCharArray();
        char[] chars2 = "Дарова".toCharArray();
        boolean isSequence = TwentyMethods.isSecondInFirstWithUsingStrings(chars1, chars2);
        assertFalse(isSequence);
    }

    //Task 19.2
    @Test
    void givenTwoArraysOfCharsWithFirstNull_whenCheckIfIsSecondInFirstWithUsingStrings_thenReturnFalse() {
        //given
        char[] chars1 = null;
        char[] chars2 = {'a', 'b', 'c', 'd'};
        //when
        boolean isSequence = TwentyMethods.isSecondInFirstWithUsingStrings(chars1, chars2);
        //then
        assertFalse(isSequence);
    }

    //Task 19.2
    @Test
    void givenTwoArraysOfCharsWithSecondNull_whenCheckIfIsSecondInFirstWithUsingStrings_thenReturnFalse() {
        //given
        char[] chars1 = {'a', 'b', 'c', 'd'};
        char[] chars2 = null;
        //when
        boolean isSequence = TwentyMethods.isSecondInFirstWithUsingStrings(chars1, chars2);
        //then
        assertFalse(isSequence);
    }

    //Task 19.2
    @Test
    void givenTwoArraysOfCharsWithFirstEmpty_whenCheckIfIsSecondInFirstWithUsingStrings_thenReturnFalse() {
        //given
        char[] chars1 = {};
        char[] chars2 = {'a', 'b', 'c', 'd'};
        //when
        boolean isSequence = TwentyMethods.isSecondInFirstWithUsingStrings(chars1, chars2);
        //then
        assertFalse(isSequence);
    }

    //Task 19.2
    @Test
    void givenTwoArraysOfCharsWithSecondEmpty_whenCheckIfIsSecondInFirstWithUsingStrings_thenReturnTrue() {
        //given
        char[] chars1 = {'a', 'b', 'c', 'd'};
        char[] chars2 = {};
        //when
        boolean isSequence = TwentyMethods.isSecondInFirstWithUsingStrings(chars1, chars2);
        //then
        assertTrue(isSequence);
    }
}