##Decorate Pattern(装饰器模式)

key concepts:

1. the decorated component and the decorator must have the same superclass or same type interface
2. the pattern can give new behavior to object in runtime with **composition** and **delegation**
3. decorator can do some valuable perform before/after the decorated componet's behavior

**Disadvantage**: This pattern can produce many little objects, and maybe let program get more and more complicated.