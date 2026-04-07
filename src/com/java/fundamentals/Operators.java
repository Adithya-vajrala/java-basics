package com.java.fundamentals;

public class Operators {
    public static void main(String[] args) {
        /*
        Assignment operator =
         */
        byte no1 = 100;
        System.out.println(no1);
        /*
        Operator precedence     ()
                             (*, /, %)
                               (-, +)
         */
        byte no2 = (1 + 2) + 10 * 2 / 10 - 18 % 10;
        System.out.println(no2);
        /*
            Type conversions
                1)implicit type conversion -- automatic type conversion
                2)Explicit type conversion -- user need to convert the types
         */
        byte no3 = 112;
        byte no4 = 127;
        int sum = no3 + no4; // if we add any integers in java the result is in int (integer + integer = int)
        long sum1 = sum; // implicit conversion
        short sum2 = (short) sum; // Explicit conversion
        System.out.println(sum1);
        System.out.println(sum2);
        /*
            relational operators
            ==, <, <=, >, >=, != these are used to check the condictions in loops
         */
        System.out.println(sum1 == sum2);
        /*
            logical operators
            logical AND &, &&
            logical OR  |, ||
            logical XOR we not use very much
         */
        byte num1 = 6;
        byte num2 = 8;
        if(num1++ == 7 && num2++ == 9){ // short circuit AND

        }
        System.out.println(num1);
        System.out.println(num2);
        if (num1++ == 8 & num2++ == 9){ // non short circuit AND

        }
        System.out.println(num1);
        System.out.println(num2);

        // same for OR also


        /*
            Increment operator and decrement operator
            pre ++i, --i before the operation increment or decrement
            post i++, i-- after the operation increment or decrement
         */
        byte i = 10 ;
        System.out.println(++i + i-- - --i + i++);
        /*
         compound Assigment operator
          i += 1 increment by 1 or adding 1 to i
          i -= 1 decrement by 1 or minus 1 from i
          imp rule: we use compound assignment operator when operation include only one variable
         */
        byte i1 = 10;
        System.out.println(i1 += 1 );
        System.out.println(i1 -= 1);

    }
}
