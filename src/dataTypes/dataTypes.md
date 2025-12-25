# Kotlin Data Types Reference

Kotlin is a statically typed language, meaning the type of every variable is known at compile time.

---

## 1. Numeric Data Types

Kotlin provides a set of built-in types that represent numbers. All floating-point types and integers are represented as objects at runtime (though the compiler optimizes them into primitives where possible).

| Category | Type | Size (bits) | Min Value | Max Value |
| :--- | :--- | :--- | :--- | :--- |
| **Integer** | `Byte` | 8 | -128 | 127 |
| **Integer** | `Short` | 16 | -32,768 | 32,767 |
| **Integer** | `Int` | 32 | -2³¹ | 2³¹ - 1 |
| **Integer** | `Long` | 64 | -2⁶³ | 2⁶³ - 1 |
| **Float** | `Float` | 32 | 6-7 decimal digits | 3.4028235E38 |
| **Float** | `Double` | 64 | 15-16 decimal digits | 1.7976931348623157E308 |

---

## 2. Other Basic Types

| Type | Description | Example |
| :--- | :--- | :--- |
| **Boolean** | Represents `true` or `false`. | `val isReady: Boolean = true` |
| **Char** | Represents a single 16-bit Unicode character. | `val letter: Char = 'A'` |
| **String** | A sequence of characters. | `val name: String = "Kotlin"` |
| **Any** | The root of the Kotlin class hierarchy. | `val obj: Any = 10` |
| **Unit** | Used for functions that return no value. | `fun printMe(): Unit { ... }` |
| **Nothing** | A value that never exists (e.g., a function that always throws). | `fun fail(): Nothing` |

---

## 3. SUMMARY (INTERVIEW READY)

### Important Concepts
* **Type Inference:** You don't always have to declare the type. `val x = 10` is automatically an `Int`.
* **Explicit Conversions:** Smaller types are **not** implicitly converted to larger types. You must use functions like `.toLong()` or `.toInt()`.
* **String Templates:** Use `${}` to insert variables into strings.
* **Nullable Types:** Append `?` to any type (e.g., `String?`) to allow it to hold a `null` value.

### Literal Constants
* **Long:** `123L`
* **Float:** `123.5f`
* **Hexadecimal:** `0x0F`
* **Binary:** `0b00001011`
* **Underscores:** `1_000_000` (Used for readability)

---