# What is Garbage Collector?

In short, this plugin is designed to free up available memory from unreferenced objects. There are many plugins on Spigot that don't manage memory well. Sometimes this can be as a result of an oversight, or just plain bad programming. As a result, there can be hundreds or even thousands of unused objects taking up memory.

This plugin is designed to be an aid to the automatic JVM process by manually calling the garbage collector at a given frequency. There are advantages and disadvantages to this, as noted below.

# Java Garbage Collection Overview

During runtime, the JVM automatically takes care of garbage collection

> "Automatic garbage collection is the process of looking at heap memory, identifying which objects are in use and which are not, and deleting the unused objects. An in use object, or a referenced object, means that some part of your program still maintains a pointer to that object. An unused object, or unreferenced object, is no longer referenced by any part of your program. So the memory used by an unreferenced object can be reclaimed." - Oracle
