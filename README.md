### Core java concepts 
 1) Wrapper classes 
     -> Class is final 
     -> instance are immutable 
     -> Read, not write 
     -> includes hashcode, toString(), equals() 
     -> We can add helper methods 
     -> Classes can be serializable and comparable 
     
 2) Enumeration 
       -> How to use enum classes with demo examples
       
 3) Annotations
      -> This is form of metaData 
      -> Create custom annotation creation 
 
 4) Serialization and Deserialization in java 
      -> In enterprise java it is quite common to have producer and consumer application 
      when one application would like to send their java object to another application over the network in the form of byte then 
      the whole process is called Serialization exact opposite to converting bytes to java object is deserialization.
      
      -> Transient -- if you dont want particular variable to get serialized we use transient key word
      
      
 5) MultiThreading in Java 
        --> this is opposite to sequential programming 
        --> Parallel execution --> throughput 
        --> Difference between thread and runnable
        --> Threads will run in parallel and not in sequence 
        --> Objects has properties and states 
        --> Two threads trying to access same objects?
        --> Intrinsic Locks and synchronization ?
        --> Method synchronized or thread sensitive code block 
        --> DeadLock 
        --> Fork-join framework for compute intensive tasks, the fork-join framework
           distribute a certain task on several workers [https://www.geeksforgeeks.org/forkjoinpool-class-in-java-with-examples/, https://www.vogella.com/tutorials/JavaConcurrency/article.html#completablefuture]
       --> single program multiple data 
       --> Muilti program multiple data 
       --> memory and processor 
       --> Shared memory --> UML NUML 
       --> symmetric multiprocessing 
       --> Cache coherence
       --> Distributed memory architecture 
       --> Process will be managed by operating system  
       
       --> Inter process communication 
       --> Threads are lightweight, process are  resource intensive 
       --> Concurrency --> with single processor does n't mean parallel programming 
       --> Parallel hardware -require multi core processing 
       --> parallel execution -- real useful computation programming 
       --> Os scheduler threads --  
       --> Scheduler  user algorithms which has different criteria like 
           * First come and first served 
           * Shortest job next 
           * priority 
           * Round robin 
           * Multiple level queues 
       --> What is Thread Life cycle ?
       create a thread --> Start --> Runnable mode --> Blocked --> Terminated  
       thread is waiting not using any CPU resources 
       
       
    
        
 
 6) Functional Interface 
 
        --> Any interface that has only  method is known  as functional interface 
        
        
 7) Auto boxing unboxing 
        --> Automatic conversion  between primitive dataTypes and their wrapper class [ vise versa]

8)  I/O streams in java 

        --> fies, devices 
        --> input and output travel via streams
        --> Input stream and output stream 
        --> 
 
 
9) Working with LocalDateTim?


### Topic: Java 8 Streams & Lambda's and functional programming

 * function take one argument and produce one result and
 * Bi-function takes two arguemnts and produces one result 
 * Consumer  takes one argument  return void 
 
 * Lambda Expressions enable you to encapsulate a single unit of behavior and pass it to other code.
 * lambda expression used for to write less efficiens
 * know much information about Collections and Comparator 
 
 
### Topic : conditional loops 
 switch statement 
  --> it doesn't support data type long 
  --> what to choose between if else and switch?
  --> Nested loops , branching 
  
### Topic: Java Objected approach 
  -> Class Anatomy 
     access modifiers, keyword, class name, super class extention/ interfaces , fields, Methods
  -> Constructor 
           special method to initialize methods 
           we can call one constructor from another constructor 
           constructor can be use access modifier 
  
  -> Initialization blocks 
      static and non static 
      
  -> Garbage collection
        memory is freed up automatically 
        
  
### Topic: Exception handling 
  --> Manully thrown exception and system generated exception 
  --> JVM has default handler that will take care of this
  --> If wont handle jvm will do throws exception and terminates the program 
  --> Handling exception main benefits 
        We could clear readable message what went wrong
        program wont terminate automatically 
        
  --> Multiple exception handling 
  --> unchecked exceptions -- this can caught and throw @ run time only 
  --> checked exceptions caught at compile --https://www.baeldung.com/java-chained-exceptions
  --> What does mean chained exceptions?
  --> additional features -- leave the resources, multi catch 
  
  
 


      
 
     
     
     
