# Java Programming & DSA Practice

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Active%20Development-brightgreen?style=for-the-badge)](#)

A structured repository containing Core Java concepts, Object-Oriented Programming (OOP), and Data Structures & Algorithms (DSA) implementations from fundamentals to advanced topics.

---

## 🏛️ Repository Architecture

The codebase is organized modularly by domain and topic progression:

```text
Java-Programming-Practice/
│
├── Java-DSA/
│   ├── 01-Basics/            # Language fundamentals, syntax, variables, data types
│   ├── 02-Arrays/            # Array manipulations, two-pointer techniques, sliding window
│   ├── 03-Strings/           # String manipulation, pattern matching, StringBuilder
│   ├── 04-Searching/         # Linear search, binary search, order-agnostic binary search
│   ├── 05-Sorting/           # Bubble, selection, insertion, merge, quick, and cyclic sort
│   ├── 06-Recursion/         # Base cases, call stacks, divide-and-conquer, backtracking
│   ├── 07-LinkedList/        # Singly, doubly, and circular linked lists
│   ├── 08-Stack/             # LIFO data structure, monotonic stack, expression parsing
│   ├── 09-Queue/             # FIFO, circular queues, deques, priority queues
│   ├── 10-Trees/             # Binary trees, BST, AVL, traversals (DFS/BFS)
│   └── 11-Graphs/            # Adjacency matrix/list, BFS, DFS, Dijkstra, Topo Sort
│
├── .gitignore                # Excludes bytecode (.class), IDE configs, and build artifacts
└── README.md                 # Project documentation and roadmap
```

---

## 📚 Curriculum Roadmap

| Module | Topic | Core Concepts Covered |
| :--- | :--- | :--- |
| **01-Basics** | Fundamentals | `HelloWorld`, Variables, Primitive & Reference Data Types, Operators, Type Casting |
| **02-Arrays** | Linear Structures | Static/Dynamic arrays, rotations, subarray sums, multi-dimensional matrices |
| **03-Strings** | Text Processing | Immutability, `String` vs `StringBuilder`, anagrams, palindromes |
| **04-Searching** | Search Algorithms | Linear Search $\mathcal{O}(n)$, Binary Search $\mathcal{O}(\log n)$, Search in 2D Matrix |
| **05-Sorting** | Sorting Algorithms | Comparison-based sorts ($\mathcal{O}(n^2)$ to $\mathcal{O}(n \log n)$), stability & in-place sorting |
| **06-Recursion** | Recursive Thinking | Recurrence relations, recursion trees, subsets, permutations |
| **07-LinkedList** | Dynamic Nodes | Pointer manipulation, reversal, cycle detection (Floyd's algorithm) |
| **08-Stack** | Stack Operations | Array/Node-based stacks, parenthesis matching, next greater element |
| **09-Queue** | Queue Operations | Queue using stacks, BFS helpers, sliding window maximum |
| **10-Trees** | Hierarchical Data | Pre/In/Post/Level-order traversals, height, diameter, BST validation |
| **11-Graphs** | Non-Linear Networks | Representation, Cycle detection, Shortest path (Dijkstra/Bellman-Ford) |

---

## 🚀 Getting Started

### Prerequisites
- **Java Development Kit (JDK)**: Version 8 or higher (JDK 17+ / 21 LTS recommended)
- **Git**

### Installation

Clone the repository locally:

```bash
git clone https://github.com/Sachinxcode-01/Java-Programming-Practice.git
cd Java-Programming-Practice
```

---

## 💻 Compilation & Execution

Navigate to any topic folder to compile and execute individual Java files:

### Example: Running Basics

```bash
# Navigate to the target module
cd Java-DSA/01-Basics

# Compile the source file
javac HelloWorld.java

# Run the compiled bytecode
java HelloWorld
```

Similarly for other starter programs:

```bash
javac Variables.java && java Variables
javac DataTypes.java && java DataTypes
```

---

## 🛠️ Contribution Guidelines

Contributions are welcome! If you would like to add problems, optimizations, or explanations:

1. **Fork** the repository.
2. **Create a branch** for your feature or problem set (`git checkout -b feature/array-problems`).
3. **Commit** your changes following clean commit message conventions (`git commit -m "Add two-pointer subarray problem in 02-Arrays"`).
4. **Push** to your branch (`git push origin feature/array-problems`).
5. Open a **Pull Request**.

---

## 📄 License

This repository is licensed under the [MIT License](LICENSE).
