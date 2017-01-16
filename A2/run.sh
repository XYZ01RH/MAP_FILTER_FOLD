#!/bin/bash
java -cp antlr-4.5.2-complete.jar org.antlr.v4.Tool A2Lexer.g
java -cp antlr-4.5.2-complete.jar org.antlr.v4.Tool A2Parser.g
javac -cp antlr-4.5.2-complete.jar *.java
java -cp antlr-4.5.2-complete.jar:. DebugPreprocessor

