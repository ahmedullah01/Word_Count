

### **Code Overview**

Our code **calculates the frequency of each word in a sentence** and **avoids printing duplicate words**. It uses **three classes**: `Main`, `Runner`, and `Counter`.

---

### **Classes and Responsibilities**

1. **Main Class**

   * Entry point of the program (`main` method).
   * Creates a `Runner` object and calls its `execute()` method.

2. **Runner Class**

   * In the `execute()` method, it creates a `Counter` object.
   * Calls the `Counter`’s `frequency()` method to print the word frequencies.

3. **Counter Class**

   * Contains the `sentence` attribute holding the string whose word frequencies are calculated.
   * `frequency()` method logic:

     1. **Lowercase conversion**: `sentence.toLowerCase()` ensures case-insensitive comparison.
     2. **Split into words**: `split(" ")` converts the sentence into an array of words.
     3. **Outer loop (`i`)**: Iterates through each word.
     4. **Duplicate check**: `alreadyexist` flag ensures words already counted are skipped.
     5. **Inner loop (`j`)**: Counts duplicates in the rest of the array.
     6. **Print count**: If the word hasn’t been counted before, prints `"Count of <word> = <count>"`.

---

### **Key Features**

* **Case-insensitive counting** (treats `The` and `the` as the same).
* **Avoids duplicate printing** using the `alreadyexist` flag.
* **Modular design**:

  * `Main` → Program start
  * `Runner` → Controls execution
  * `Counter` → Handles word frequency logic

---

### **Example Output**

For sentence: `"The dog chased the dog and the dog ran away"`

```
Count of the = 3
Count of dog = 3
Count of chased = 1
Count of and = 1
Count of ran = 1
Count of away = 1
```

* Notice: `"the"` and `"dog"` counts are printed **only once**, avoiding duplicate lines.
