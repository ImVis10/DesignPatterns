Suppose you set up a furniture shop, and software to manage it.
So far, your code consists of classes that represent:
1. Living room furniture. (Chair, Sofa, Coffee Table)
2. Variants of this furniture. (Everyday, Modern, Victorian).

You need a way to create individual furniture objects so that they match other objects of the same family. As it is not good for the customers and business when customers receive non-matching furniture.

Also, you don't wanna change existing code when adding new products or variants of products to your business. Your vendors update their catalogs very often, you wouldn't want to change the core of your business logic each time they update the catalog.

How do you resolve this?