# Kotlin Operators & Precedence

This guide provides a quick reference for operator precedence and common categories used in Kotlin development.

---

## 1. Operator Precedence
When multiple operators are used in a single expression, they are evaluated based on their priority (highest to lowest).

| Level | Operator Type | Symbols |
| :--- | :--- | :--- |
| 1 | **Unary** | `+`, `-`, `!`, `++`, `--` |
| 2 | **Multiplicative** | `*`, `/`, `%` |
| 3 | **Additive** | `+`, `-` |
| 4 | **Range** | `..`, `..<` |
| 5 | **Comparison** | `<`, `>`, `<=`, `>=`, `==`, `!=` |
| 6 | **Logical AND** | `&&` |
| 7 | **Logical OR** | `||` |
| 8 | **Elvis** | `?:` |
| 9 | **Assignment** | `=`, `+=`, `-=`, `*=`, `/=`, `%=` |

> **Tip:** Always use **parentheses `()`** to make complex expressions more readable and to ensure the correct order of evaluation.

---

## 2. Summary (Interview Ready)

Use this categorized list for quick recall during technical interviews.

### Arithmetic & Assignment
* **Arithmetic:** `+`, `-`, `*`, `/`, `%`
* **Augmented Assignment:** `+=`, `-=`, `*=`, `/=`, `%=`

### Comparison & Equality
* **Comparison:** `<`, `>`, `<=`, `>=`
* **Structural Equality:** `==` (calls `.equals()`), `!=`
* **Referential Equality:** `===` (points to same object), `!==`

### Logical & Null Safety
* **Logical:** `&&` (AND), `||` (OR), `!` (NOT)
* **Null Handling:** `?.` (Safe call), `!!` (Not-null assertion), `?:` (Elvis operator)

### Specialized Operators
* **Membership:** `in`, `!in` (Check if an item is in a collection/range)
* **Type Checks:** `is`, `!is` (Check instance type)
* **Ranges:** `..`, `until`, `downTo`, `step`

---