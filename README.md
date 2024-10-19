# Sorting Algorithms in Java

## Best, Average, and Worst Cases

### Best case (Ω)

The best case of a sorting algorithm is to have a pre-sorted array

Ex: [1, 2, 3, 4, 5]

### Average case (θ)

The average case of a sorting algorithm (the most common) is the scenario where an array is unsorted, in no particular order

Ex: [4, 1, 2, 5, 3]

### Worst case (O)

The worst case of a sorting algorithm is to have an array so unsorted that we absolutely have to sort each and every element in it. This occurs when the array is actually in the opposite sorted order

Ex: [5, 4, 3, 2, 1]

---

## Comparing various algorithms

### Selection Sort

Selection sort works by having an ephemeral partition between the sorted and unsorted parts of the array. We iterate through the entire array, at each iteration we iterate through the unsorted partition in order to find the minimal element and swap it with the current element in the iteration

#### Pseudocode:

```pseudo
for each i-elem in the arr:
    for each j-elem in the unsorted arr partition:
        if the j-elem is the minimal element:
            swap arr[i] and arr[j]
```

### Bubble Sort

Bubble sort works by iterating through the array and in each iteration we compare every two adjacent elements and swap if the left element is larger than the right element

#### Pseudocode:

```pseudo
for each i-elem in the arr:
    for each j-elem in the arr:
        if the j-elem is larger than the element to the right:
            swap the i-elem and the j-elem
```

### Insertion Sort

Insertion sort works by having an ephemeral partition between the sorted and unsorted parts of the array much like Selection Sort. The main difference is in how we parse and place elements. We iterate through all the sorted elements of the array that are larger than the i<sup>th</sup> element and shift them to the right by 1 place. Once we have parsed through all the larger sorted elements we can then insert the current element into the remaining empty cell.

#### Pseudocode:

```pseudo
for each i-elem in the arr:
    for each j-elem in the sorted arr partition:
        if the j-elem is more than the current i-elem:
            shift the j-elem to the right
            continue;
        place i-elem into the last j index
```
