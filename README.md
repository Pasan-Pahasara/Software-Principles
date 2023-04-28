# Software-Principles

This project introduced the principles of SOLID. SOLID is an acronym that stands for five key design principles: Single Liability Principle, Open Closed Principle, Liskov Substitution Principle, Interface Separation Principle, and Dependent Inversion Principle.

![solid-design-principle-1](https://user-images.githubusercontent.com/88943660/235159341-aab3cfbe-f00c-4593-90db-a65d66778740.jpg)

1. #### `Single Responsibility Principle`: 
    * It states that “a class should have only one reason to change” which means every class should have a single responsibility or single job or single purpose.

2. #### `Open/Closed Principle`: 
    * It states that “software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification” which means you should be able to extend a class behavior, without modifying it.

3. #### `Liskov’s Substitution Principle`: 
    * According to this principle “Derived or child classes must be substitutable for their base or parent classes“. This principle ensures that any class that is the child of a parent class should be usable in place of its parent without any unexpected behavior.

4. #### `Interface Segregation Principle`: 
    * It states that “do not force any client to implement an interface which is irrelevant to them“. Here you should prefer many client interfaces rather than one general interface and each interface should have a specific responsibility.

5. #### `Dependency Inversion Principle`: 
    * High-level modules/classes should not depend on low-level modules/classes. Both should depend upon abstractions. Abstractions should not depend upon details. Details should depend upon abstractions.
#

## `HOW TO CREATE NEW BRANCH AND PUSH IT`

* `git checkout -b <your-new-branch>`
* `git add .`
* `git commit -m <message>`
* `git push --set-upstream origin <your-new-branch>`

## `HOW TO MOVE ANY BRANCHES`

* `git status .`
* `git add .`
* `git stash`
* `git checkout <your-new-branch>`

### 
