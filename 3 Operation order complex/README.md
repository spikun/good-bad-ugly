## Java Incrementation Order Complex
Pre-Increment/Decrement (++i/--i) - Incrementation/Decrement will happen before the variable usage
Post-Increment/Decrement (i++/i--) - Incrementation/Decrement will happen after the variable usage

Example:
int i = 1;
int total = --i * 5 - i++;

Operation order will happen from the left to the right.
1) 0 * 5 - i++; // i = 0
2) 0 - i++; //i = 0
3) 0 - 0; //i = 1
4) 0