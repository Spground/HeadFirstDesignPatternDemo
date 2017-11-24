
## Strategy Pattern(策略模式)

Distinguish variable part and immutable part, then  abstract and encapsulate the variable part as a 
"Behavior Class", using compostion instead of inheritence. Obejct delegates some variable behaviors to
Behavior Class, as a reuslt, we just only need to add or modified our "Behavior Class" when some new 
demands are added or some business logic are changed with keeping original code clean.