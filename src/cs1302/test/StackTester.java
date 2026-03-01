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

    /**
     * Run tests for uses cases that each start with a new
     * {@link Stack} object returned by {@link #newStack()}.
     */
    public void testAll() {
        stackTest01();
        stackTest02();
    } // test

    public static void main(String[] args) {
        System.out.println("\n[Running Stack Tester]");
        StackTester tester = new StackTester();
        tester.testAll();
    } // main

} // StackTester
