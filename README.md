
# DSA-INF2010: Data Structures and Algorithms

## Table of Contents

1. [Introduction](#introduction)
2. [Sorting Algorithms](#sorting-algorithms)
   - [Selection Sort](#selection-sort)
   - [Bubble Sort](#bubble-sort)
   - [Insertion Sort](#insertion-sort)
3. [Data Structures](#data-structures)
   - (Add your data structures here)
4. [Best, Average, and Worst Case Complexity](#complexity)

---

## Introduction

This repository contains notes and code implementations for various algorithms and data structures, as part of the DSA-INF2010 course at Polytechnique Montreal. The goal is to provide a well-organized resource for studying and understanding the core topics in data structures and algorithms.

---

## Sorting Algorithms

### Selection Sort

Selection sort works by having a partition between the sorted and unsorted parts of the array. During each iteration, it finds the minimal element in the unsorted portion and swaps it with the first unsorted element.

#### Pseudocode:
```pseudo
for each i-elem in the arr:
    for each j-elem in the unsorted arr partition:
        if the j-elem is the minimal element:
            swap arr[i] and arr[j]
```

#### Complexity:
- Best case: Ω(n²)
- Average case: θ(n²)
- Worst case: O(n²)

---

### Bubble Sort

Bubble sort iterates through the array, comparing adjacent elements and swapping them if they are out of order. This process repeats until the array is sorted.

#### Pseudocode:
```pseudo
for each i-elem in the arr:
    for each j-elem in the arr:
        if the j-elem is larger than the element to the right:
            swap the i-elem and the j-elem
```

#### Complexity:
- Best case: Ω(n²)
- Average case: θ(n²)
- Worst case: O(n²)

---

### Insertion Sort

Insertion sort partitions the array into sorted and unsorted sections. It inserts each unsorted element into its correct position within the sorted section.

#### Pseudocode:
```pseudo
for each i-elem in the arr:
    for each j-elem in the sorted arr partition:
        if the j-elem is more than the current i-elem:
            shift the j-elem to the right
            continue;
        place i-elem into the last j index
```

#### Complexity:
- Best case: Ω(n)
- Average case: θ(n²)
- Worst case: O(n²)

---

## Data Structures

(Add your data structures here, following a similar format as algorithms)

---

## Best, Average, and Worst Case Complexity

- **Best case (Ω):** Scenario where the array is already sorted.
  - Example: [1, 2, 3, 4, 5]

- **Average case (θ):** Scenario where the array is unsorted, with no particular order.
  - Example: [4, 1, 2, 5, 3]

- **Worst case (O):** Scenario where the array is completely reversed.
  - Example: [5, 4, 3, 2, 1]
