# Java Multiple Interfaces Example

A small Java program that shows one class implementing **two interfaces** at the same time.

## What It Demonstrates

Java classes can extend only one class, but they can implement any number of interfaces:

```java
interface InterfaceA {
    void eat();
}

interface InterfaceB {
    void dance();
}

class C implements InterfaceA, InterfaceB {
    @Override
    public void eat() {
        System.out.println("C can eat");
    }

    @Override
    public void dance() {
        System.out.println("C can dance");
    }
}
```

Class `C` must implement the methods from both interfaces.

## Code Overview

| Type | Role |
|------|------|
| `InterfaceA` | Declares `eat()` |
| `InterfaceB` | Declares `dance()` |
| `C` | Implements both interfaces |
| `MultipleInterfaceDemo` | Contains `main`, creates a `C` object and calls both methods |

## Output

```
C can eat
C can dance
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac MultipleInterfaceDemo.java
java MultipleInterfaceDemo
```

## Project Structure

```
.
├── MultipleInterfaceDemo.java
└── README.md
```

## Next Steps

- Add a third interface and implement it in `C`
- Refer to the object through each interface type (`InterfaceA a = new C();`)
- Explore `default` methods in interfaces
