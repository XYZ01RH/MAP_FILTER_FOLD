# MAP_FILTER_FOLD
Spring 2016 VCU Programming Languages: Assignment2

Design and implement a pre-processor / code injector bringing MAP / FILTER / FOLD functionality into Java 7
Using ANTLR(v4)

MAP essentially takes on input a list / collection, and a piece of Java code, and returns another list, resulting from applying the code to each element of the input list.
E.g. take a list of strings, and code to convert a string to upper case. The result should be a list of uppercase strings

FILTER essentially takes on input a list / collection, and Java code for an expression that  returns a Boolean type, and  returns another list, containing only those elements of the input for which the expression evaluates to TRUE
E.g. take a list of strings, and an expression that returns true if a string is >6. The result should be a list of strings of lengths>6

FOLD essentially takes on input a list / collection, and a piece of Java code, and returns a single value, composed of applying the code to every element in the input list.
E.g. take a list of strings, and a code that adds length of a string to some variable that was initislized with 0. In result, that variable should contain sum of lengths of strings in the input list

Parser should:
  Read in a Java file
  Produce a modified Java file
    If the line in input Java file starts with # then inject some code
    Other lines in the input Java - just copy to output Java
