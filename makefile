#
# makefile 
#
# input file for 'make' build tool ( /usr/bin/make )
# to build solution for CS 5666 JUnit sample
#
# @author Dr. Fenwick
# @version Spring 2017
#

JUNIT_JAR = /usr/share/java/junit-4.10.jar
HAMCREST_JAR = /usr/share/java/hamcrest/core-1.1.jar

default: 
	@echo "usage: make target"
	@echo "available targets: compile, test, clean"

compile: greetings/Hello.java junit/HelloTest.java
	javac greetings/Hello.java
	javac -d junit greetings/Hello.java
	javac -cp junit:$(JUNIT_JAR) junit/HelloTest.java
clean:
	rm -f greetings/Hello.class
	rm -f junit/HelloTest.class
	rm -rf junit/p1

test: greetings/Hello.class junit/HelloTest.class 
	java -cp junit:$(JUNIT_JAR):$(HAMCREST_JAR) org.junit.runner.JUnitCore HelloTest
