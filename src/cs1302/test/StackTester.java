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
    } // test

    public static void main(String[] args) {
        System.out.println("\n[Running Stack Tester]");
        StackTester tester = new StackTester();
        tester.testAll();
    } // main

} // StackTester
