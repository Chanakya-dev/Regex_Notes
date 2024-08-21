*** 1. Literals
Definition: Characters that match themselves exactly.
Example:
Regex: cat
Matches: "cat" in the string "cat"

2. Metacharacters
Definition: Characters with special meanings in Regex. These are used to define patterns.
Common Metacharacters:
. (Dot): Matches any single character except newline.
Regex: c.t
Matches: "cat", "cot", "cut"

^ (Caret): Anchors the match at the start of the string.
Regex: ^cat
Matches: "cat" in "catfish", but not in "bobcat"

$ (Dollar): Anchors the match at the end of the string.
Regex: cat$
Matches: "bobcat" in "bobcat", but not in "catfish"

[] (Brackets): Matches any single character inside the brackets (character class).
Regex: [aeiou]
Matches: "a", "e", "i", "o", or "u" in a string

| (Pipe): Acts as a logical OR between patterns.
Regex: cat|dog
Matches: "cat" or "dog"

3. Quantifiers
Definition: Specify how many times the preceding element must occur.
Common Quantifiers:

* : 0 or more times
Regex: ca*t
Matches: "ct", "cat", "caat"

+ : 1 or more times
Regex: ca+t
Matches: "cat", "caat" but not "ct"


? : 0 or 1 time (optional)
Regex: ca?t
Matches: "cat", "ct"

{n} : Exactly n times
Regex: a{3}
Matches: "aaa"

{n,} : n or more times
Regex: a{3,}
Matches: "aaa", "aaaa", etc.

{n,m} : Between n and m times
Regex: a{2,4}
Matches: "aa", "aaa", "aaaa"

4. Character Classes
Definition: A set of characters enclosed in square brackets []. It matches any one character from the set.
Examples:
[abc] : Matches any one of a, b, or c.

[a-z] : Matches any lowercase letter.

[A-Z] : Matches any uppercase letter.

[0-9] : Matches any digit.

[^abc] : Matches any character except a, b, or c.

\d : Matches any digit (equivalent to [0-9]).
\D : Matches any non-digit (equivalent to [^0-9]).
\w : Matches any word character (alphanumeric + underscore).
\W : Matches any non-word character.

5. Anchors

Definition: Used to specify a position in the text.
Examples:
^ : Matches the start of a string.
$ : Matches the end of a string.
6. Groups and Capturing

Definition: Parentheses () are used to group part of a regex together. This can be used to apply quantifiers to a group or to capture a part of the match for further processing.
Example:
Regex: (ab)+
Matches: "ab", "abab", "ababab"

7. Escaping Special Characters
Definition: Some characters have special meanings in Regex. To match these characters literally, you need to escape them with a backslash (\).
Examples:

. : Matches any character, but \. matches a literal dot.
* : Matches 0 or more of the preceding element, but \* matches a literal asterisk.

8. Predefined Character Classes
Examples:
\d : Matches any digit (equivalent to [0-9]).
\D : Matches any non-digit (equivalent to [^0-9]).
\w : Matches any word character (alphanumeric + underscore, equivalent to [A-Za-z0-9_]).
\W : Matches any non-word character (equivalent to [^A-Za-z0-9_]).
\s : Matches any whitespace character (spaces, tabs, newlines).
\S : Matches any non-whitespace character.


9. Lookahead and Lookbehind

Lookahead: Asserts that a certain pattern must follow the current position in the string without including it in the match.
Example: q(?=u) matches "q" only if it's followed by "u".

Lookbehind: Asserts that a certain pattern must precede the current position in the string without including it in the match.
Example: (?<=a)b matches "b" only if it's preceded by "a".

Example Problems
Finding Words Starting with "a":
Regex: \ba\w*
Matches words that start with "a" (e.g., "apple", "ant").

Validating a Simple Date Format (YYYY-MM-DD):
Regex: ^\d{4}-\d{2}-\d{2}$
Matches dates in the format "2024-08-20".

Extracting Domain from an Email Address:
Regex: @([A-Za-z0-9.-]+)
Matches the domain part of an email (e.g., "example.com" in "user@example.com").
