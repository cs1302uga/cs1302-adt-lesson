#!/bin/bash -e

echo "#"
echo "# This is an example of an interpreter script."
echo "# You can read about how to create your own in"
echo "# the 'Interpreter Scripts' section under 'Tools'"
echo "# in the book."
echo "#"

# Turn on command echoing
set -x

# Exit the script if any errors are encountered
set -e

# Delete old class files
rm -rf bin

# Compile the interface to bin
javac -d bin         src/cs1302/adt/Stack.java

# Compile the abstract parent to bin
javac -d bin -cp bin src/cs1302/adt/BaseStack.java

# Compile the child classes
javac -d bin -cp bin:lib/cs1302-str-list.jar src/cs1302/adt/LinkedStack.java
javac -d bin -cp bin src/cs1302/adt/ArrayStack.java
javac -d bin -cp bin:lib/cs1302-str-list.jar src/cs1302/adt/OracleStack.java

# Compile the Tester
javac -d bin -cp bin src/cs1302/test/StackTester.java

# Run the Tester
java -cp bin:lib/cs1302-str-list.jar cs1302.test.StackTester
