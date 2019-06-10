#Stack and Queues
Stack: A stack is a container of objects that are inserted and removed according to the last-in first-out (LIFO) principle.

Queue: A Queue is very similar to the Stack data structure with one major difference. Rather than follow a LIFO behavior, a Queue data structure goes by FIFO, which stands for First-In-First-Out.


##Challenges

**Stack part**

Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.

Create a Stack class that has a top property. It creates an empty Stack when instantiated.

This object should be aware of a default empty value assigned to top when the stack is created.

Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.

Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.

Define a method called peek that does not take an argument and returns the value of the node located on the top of the stack.

**Queue part**

This object should be aware of a default empty value assigned to front when the queue is created.

Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.

Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.

Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue.


**Approach & Efficiency**
stack: pop() T<-O(1) s<-O(H) push() T<-O(1) s<-O(1) peek() T<-O(1) s<-O(1)

queue: enqueue() T<-O(1) s<-O(1) dequeue() T<-O(1) s<-O(H) peek() T<-O(1) s<-O(1)

**API**

All public access to the methods creatd in Stack and Queue.