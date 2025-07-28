Java Interview Revision Notes – Stack vs Heap & Pass by Value/Reference
=======================================================================

🧠 Java uses two types of memory: Stack and Heap

- Stack: Temporary memory for method calls. Stores primitive variables and object references.
- Heap: Permanent memory for objects like arrays, class instances, etc.

===========================================================
Understanding How Java Passes Data to Methods
===========================================================

Java is strictly PASS BY VALUE.

That means:
- For primitive types (int, float, char, etc.), the actual value is copied.
- For objects/arrays, the reference (remote control) is copied.

So even for arrays/objects, Java is still pass by value — it’s just the reference that’s copied.

===========================================================
Primitive Type Example:
===========================================================

int a = 10;
change(a);

Inside method:
void change(int x) {
   x = 99;
}

Result:
The value of 'a' remains 10 — because the method got a COPY of the value.

===========================================================
Array/Object Example:
===========================================================

int[] arr = {1, 2, 3};
change(arr);

Inside method:
void change(int[] arr) {
   arr[0] = 99;
}

Result:
The array gets modified → Output: [99, 2, 3]
Why? Because arr points to the same object in heap, and method got a copy of that reference.

===========================================================
Important TWIST – Reassigning the Reference Inside Method:
===========================================================

int[] arr = {1, 2, 3};
change(arr);

Inside method:
void change(int[] arr) {
   arr = new int[]{9, 9, 9};
}

Result:
No change → Output: [1, 2, 3]

Why? Because the method got a copy of the reference.
When the reference is reassigned, it only affects the method's local copy, not the original.

===========================================================
One-line Summary for Interview:
===========================================================

Java is always pass by value.
For objects/arrays, the value passed is a reference copy.
You can change the object via that reference, but reassigning it won't change the original.

===========================================================
Easy Analogy:
===========================================================

Think of the reference as a TV remote.

- You give someone a remote (reference) to your TV (object).
- If they use the remote to change the channel → TV really changes.
- But if they break the remote and use their own new remote (reassign) → your TV doesn’t change.

===========================================================
Quick Recap:
===========================================================

- Primitives → value copied → can’t change original
- Objects/Arrays → reference copied → can modify content
- Reassigning reference in method → does NOT affect original

END OF NOTES
