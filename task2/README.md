Lists and tuples are both data structures in the Python.

List is a dynamic data structure.
It does not store the values directly, as it is the case in C-like languages, but rather store the references to the objects
that are stored in the heap. 
Considering the dynamic nature of the list, it allocates more memory than required to avoid frequent resizing. 
This observation will be made while examining the code.


Tuples is an immutable data structure.
Similar to list, it stores the references to the objects, not the actual values.
However, tuples are more memory efficient, as they don't need any memory overhead for possible resizing.

```
tpl = (1,2,3)
print(tpl.__sizeof__())

lst = [1,2,3]
print(lst.__sizeof__())
```

To be one the same page, `__sizeof__()` here gives us the baseline size of the data structure, as opposed
to sys.getsizeof(), where the garbage collector's overhead is also counted.


In the code above, we have a tuple (tpl) and a list (lst).
When executing the code, we get the following:

48
72

It can be seen that the tuple occupies less memory than a list.



