*Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes. In short, abstract factory is a factory of factories.*

The first thing Abstarct factory pattern suggests is to explicilty declare interfaces for each distinct product(chair, sofa, coffee table) of a family of products (chair & sofa & coffee table). So that next, you can make all variants of the products (everyday, modern, victorian) implement the interfaces we defined above.

Next, to create the objects we need a factory. So we declare *Abstract factory* - an interface with a list of object creation methods. These methods return root product types i.e. Chair, Sofa, Coffee Table.
So now all we have to left tod eal with is variants of products. We create separate factory classes based on the *Abstract factory* interface. For instance, *ModernFurnitureFactory* creates objects: ModernChair, ModernSofa, ModernCoffeeTable