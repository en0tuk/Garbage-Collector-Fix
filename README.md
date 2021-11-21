# What is Garbage Collector?

In short, this plugin is designed to free up available memory from unreferenced objects. There are many plugins on Spigot that don't manage memory well. Sometimes this can be as a result of an oversight, or just plain bad programming. As a result, there can be hundreds or even thousands of unused objects taking up memory.

This plugin is designed to be an aid to the automatic JVM process by manually calling the garbage collector at a given frequency. There are advantages and disadvantages to this, as noted below.

# Java Garbage Collection Overview

During runtime, the JVM automatically takes care of garbage collection

> "Automatic garbage collection is the process of looking at heap memory, identifying which objects are in use and which are not, and deleting the unused objects. An in use object, or a referenced object, means that some part of your program still maintains a pointer to that object. An unused object, or unreferenced object, is no longer referenced by any part of your program. So the memory used by an unreferenced object can be reclaimed." - Oracle

# Advantages/Disadvantages of This Plugin

As stated earlier, this plugin manually calls the JVM garbage collector at given intervals. Doing this only makes a suggestion to the VM that it should run the garbage collector, but doesn't guarantee that it will actually run at that moment. In addition, depending on the objects in memory, calling the GC may actually have no effect. Running the GC frequently may cause temporary performance degradation, especially if there's a lot of cleaning up to do. All of this might not matter, however, because startup flags like -XXnoSystemGC will prevent this from even running. If all goes well, you'll have more memory to work with on your server.

This is just an overview and if you want to know more, you can do some research on the garbage collector and the advantages and disadvantages of manually calling it.

# Should I Use This Plugin?

If you are using many memory-intensive or questionably designed plugins on a server with low memory, then I'd recommend giving this a try. This, of course, will vary considerably from server to server.
