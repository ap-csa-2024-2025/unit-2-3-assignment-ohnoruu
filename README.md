[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=16212684)
# unit-2-3-assignment

## FirstLastN
Write a method named `firstLastN`, that takes in two inputs: a `String` and an `int n`.  The method should return a new String that is the first `n` letters of the input `String` concatenated (combined) with the last `n` letters of the input `String`.  Assume that the number `n` is always between 0 and the length of the `String` inclusive
 (i.e., it is never out of bounds).  Test your method in the `main()` method.

Sample run 1:

Inputs:
* "dictionary"
* 1
```
dy
```
Sample run 2:

Inputs:
* "apple"
* 2
```
aple
```
Hint - we saw in the lesson how to get the first letter of a string using the substring method. Think how you could use the .length() String method to find the index of the last character, and how you could use this index in the substring method to get the last character.

## DelEnd
Write a method named `delEnd`, that takes in two inputs: a `String` and an `int n`.  The method should return a new String that is the original String, but with the last `n` letters removed.  Assume that the number `n` is always between 0 and the length of the `String`.  Test your method in `main()`.

Sample Inputs:
* "library"
* 5
```
li
```

## CompareLowerCase
Write a method named `compareLower` that takes in two `Strings` as inputs, and returns
* a negative number if the first input comes before the second input
* 0 if they are the same word
* a positive number if the first input comes after the second input

The method should not be case-sensitive.  As in, `"framing"` and `"framING"` should be considered the same word.

Hint: Either change to upper or lower case before comparing the Strings.

Sample run 1:
```
Sterling
material
Result: 6
```

Sample run 2:
```
framing
framiNG
Result: 0
```

Sample run 3:
```
BAgels
candLes
Result: -1
```

## LengthFirst
Write a method named `lengthFirst` that takes in an entire sentence, and returns the length of the first word in the sentence.  Assume that the sentence always has at least two words.

Hint #1: think about how you know where the first word ends - you may assume that the sentence contains more than one word.

Hint #2: To make your life easier, use a string method that utilizes space. It looks kind of looks like this: `String.method(" ")`.

Sample run 1:
```
Everything in its right place
10
```

Sample run 2:
```
Down is the new up
4
```
