This is where Strategy Pattern comes into play and rescues us.

**Why is it named Strategy Pattern?**

Stargey pattern suggests that you take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes called *Strategies*.

**When to use?**

* Use the Strategy pattern when you want to use different vari-
ants of an algorithm within an object and be able to switch
from one algorithm to another during runtime.

*The Strategy pattern lets you indirectly alter the object’s
behavior at runtime by associating it with different sub-objects
which can perform specific sub-tasks in different ways.*

* Use the Strategy when you have a lot of similar classes that
only differ in the way they execute some behavior.

*The Strategy pattern lets you extract the varying behavior into
a separate class hierarchy and combine the original classes
into one, thereby reducing duplicate code.*

* Use the pattern to isolate the business logic of a class from
the implementation details of algorithms that may not be as
important in the context of that logic.

*The Strategy pattern lets you isolate the code, internal data,
and dependencies of various algorithms from the rest of the
code. Various clients get a simple interface to execute the
algorithms and switch them at runtime.*

* Use the pattern when your class has a massive conditional
operator that switches between different variants of the same
algorithm.

*The Strategy pattern lets you do away with such a conditional
by extracting all algorithms into separate classes, all of which
implement the same interface. The original object delegates
execution to one of these objects, instead of implementing all
variants of the algorithm.*

**How to Implement?**

1. In the context class, identify an algorithm that’s prone to fre-
quent changes. It may also be a massive conditional that
selects and executes a variant of the same algorithm at
runtime.

1. Declare the strategy interface common to all variants of the
algorithm.

1. One by one, extract all algorithms into their own classes. They
should all implement the strategy interface.

1. In the context class, add a field for storing a reference to a
strategy object. Provide a setter for replacing values of that
field. The context should work with the strategy object only
via the strategy interface. The context may define an interface
which lets the strategy access its data.

1. Clients of the context must associate it with a suitable strate-
gy that matches the way they expect the context to perform its
primary job.

In laymen terms, in Startegy Design pattern we create an interface and it's different implementation based on strategy !! And inject appropriate startegy in client class by creating constructor or any injection of your choice
