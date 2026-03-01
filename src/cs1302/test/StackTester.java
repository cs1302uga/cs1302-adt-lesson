package cs1302.test;

import cs1302.adt.Stack;
import cs1302.adt.OracleStack;
import cs1302.adt.LinkedStack;
import cs1302.adt.ArrayStack;

/**
 * Simple test program for ADT tests.
 */
public class StackTester {

    /**
     * Return a new, empty {@link Stack} object of the associated
     * implementation class.
     *
     * @return a new, empty stack.
     */
    public Stack newStack() {
        return new ArrayStack();
    } // new Stack

    /** Test 1. */
    private void stackTest01() {
        System.out.print("01. new stack has size() == 0: ");

        Stack stack = this.newStack();

        if (stack.size() == 0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest01

    /** Test 2. */
    private void stackTest02() {
        System.out.print("02. new stack isEmpty() == true: ");

        Stack stack = this.newStack();

        if (stack.isEmpty()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest02

    /** Test 3. */
    private void stackTest03() {
        System.out.print("03. size() == 1 after pushing 1 item: ");

        Stack stack = this.newStack();
        stack.push("a");

        if (stack.size() == 1) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest03

    /** Test 4. */
    private void stackTest04() {
        System.out.print("04. size() == 3 after pushing 3 items: ");

        Stack stack = this.newStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        if (stack.size() == 3) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest04

    /** Test 5. */
    private void stackTest05() {
        System.out.print("05. size() == 3 after pushing 3 items: ");

        Stack stack = this.newStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        if (stack.size() == 4) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest05

    /** Test 6. */
    private void stackTest06() {
        System.out.print("06. peek() is the last item pushed after 1 push: ");

        Stack stack = this.newStack();
        stack.push("a");

        if (stack.peek().equals("a")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // test6

    /** Test 7. */
    private void stackTest07() {
        System.out.print("07. peek() is the last item pushed after 2 pushes: ");

        Stack stack = this.newStack();
        stack.push("a");
        stack.push("b");

        if (stack.peek().equals("b")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest07

    /** Test 8. */
    private void stackTest08() {
        System.out.print("8. peek() is the last item pushed after 3 pushes: ");

        Stack stack = this.newStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        if (stack.peek().equals("c")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest08

    /** Test 9. */
    private void stackTest09() {
        System.out.print("9. pop() is the last item pushed after 1 push: ");

        Stack stack = this.newStack();
        stack.push("a");

        if (stack.pop().equals("a")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest09

    /** Test 10. */
    private void stackTest10() {
        System.out.print("10. 1 call to pop() is correct after 2 pushes: ");

        Stack stack = this.newStack();
        stack.push("a");
        stack.push("b");

        if (stack.pop().equals("b")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest10

    /** Test 11. */
    private void stackTest11() {
        System.out.print("11. 2 calls to pop() are correct after 2 pushes: ");

        Stack stack = this.newStack();
        stack.push("a");
        stack.push("b");

        if (stack.pop().equals("b") && stack.pop().equals("a")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest11

    /** Test 12. */
    private void stackTest12() {
        System.out.print("12. 1 call to pop() is correct after 3 pushes: ");

        Stack stack = this.newStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        if (stack.pop().equals("c")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest12

    /** Test 13. */
    private void stackTest13() {
        System.out.print("13. 2 calls to pop() are correct after 3 pushes: ");
        Stack stack = this.newStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        if (stack.pop().equals("c") && stack.pop().equals("b")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest13

    /** Test 14. */
    private void stackTest14() {
        System.out.print("14. 3 calls to pop() are correct after 3 pushes: ");

        Stack stack = this.newStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        boolean firstPop = stack.pop().equals("c");
        boolean secondPop = stack.pop().equals("b");
        boolean thirdPop = stack.pop().equals("a");

        if (firstPop && secondPop && thirdPop) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if

    } // stackTest11

    /** Test 15. */
    private void stackTest15() {
        System.out.print("15. size() is 3 after 4 pushes and 1 pop(): ");

        Stack stack = this.newStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.pop();

        if (stack.size() == 3) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest15

    /** Test 16. */
    private void stackTest16() {
        System.out.print("16. size() is 1 after 3 pushes and 2 pop(): ");

        Stack stack = this.newStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.pop();
        stack.pop();

        if (stack.size() == 1) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest16

    /** Test 17. */
    private void stackTest17() {
        System.out.print("17. size() is 0 after 3 pushes and 3 pop(): ");

        Stack stack = this.newStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.pop();
        stack.pop();
        stack.pop();

        if (stack.size() == 0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        } // if
    } // stackTest17

    /**
     * Run tests for uses cases that each start with a new
     * {@link Stack} object returned by {@link #newStack()}.
     */
    public void testAll() {
        stackTest01();
        stackTest02();
        stackTest03();
        stackTest04();
        stackTest05();
        stackTest06();
        stackTest07();
        stackTest08();
        stackTest09();
        stackTest10();
        stackTest11();
        stackTest12();
        stackTest13();
        stackTest14();
        stackTest15();
        stackTest16();
        stackTest17();
    } // test

    public static void main(String[] args) {
        System.out.println("\n[Running Stack Tester]");
        StackTester tester = new StackTester();
        tester.testAll();
    } // main

} // StackTester
