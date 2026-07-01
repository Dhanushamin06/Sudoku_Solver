# 🧩 Sudoku Solver

A Java desktop application that solves any valid Sudoku puzzle instantly using the **Backtracking Algorithm**, featuring an interactive GUI built with Java Swing.

---

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [How to Use](#how-to-use)
- [How It Works](#how-it-works)
- [Project Structure](#project-structure)
- [Algorithm](#algorithm)

---

## Overview

Sudoku Solver is a lightweight Java desktop application that takes a partially filled 9×9 Sudoku grid as input and solves it automatically using recursive backtracking. It provides a clean graphical interface where users can enter puzzle values and receive the complete solution with a single click.

---

## ✨ Features

- 🖥️ **Interactive 9×9 GUI** — Enter numbers directly into the visual grid
- ⚡ **Instant Solving** — Solves any valid Sudoku puzzle in milliseconds
- 🔁 **Backtracking Algorithm** — Efficiently finds the solution by exploring all possibilities
- ❌ **No Solution Detection** — Alerts the user if the puzzle has no valid solution
- 🪟 **Cross-Platform** — Runs on Windows, macOS, and Linux (any system with Java)

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| **Java** | Core programming language |
| **Java Swing** | GUI framework for the desktop window |
| **AWT (Abstract Window Toolkit)** | Layout management and event handling |
| **Backtracking Algorithm** | Puzzle solving logic |

## ⚙️ How It Works

The application is split into two classes:

### `SudokuGUI.java` — User Interface
- Creates a **9×9 grid** of text fields using `JPanel` with `GridLayout`
- Reads the user's input from each cell when "Solve" is clicked
- Passes the board as a 2D integer array to `SudokuSolver`
- Displays the solved values back in the grid

### `SudokuSolver.java` — Solving Logic
- Implements a **recursive backtracking algorithm**
- Scans for empty cells (represented as `0`)
- Tries numbers 1–9 in each empty cell
- Validates each number against Sudoku rules (row, column, 3×3 box)
- Backtracks if no valid number fits and tries a different path

---

## 📁 Project Structure

```
Sudoku_Solver/
├── src/
│   ├── SudokuGUI.java       # GUI — Swing window, grid, button
│   └── SudokuSolver.java    # Logic — Backtracking algorithm
├── out/                     # Compiled .class files (generated)
├── .vscode/                 # VS Code Java settings
└── README.md
```

---

## 🧠 Algorithm

The solver uses **Recursive Backtracking**:

```
1. Find the next empty cell (value = 0)
2. Try placing digits 1 through 9
3. Check if the digit is valid:
   - Not already in the same ROW
   - Not already in the same COLUMN
   - Not already in the same 3×3 BOX
4. If valid → place the digit and recurse to the next empty cell
5. If recursion fails → remove the digit (backtrack) and try the next one
6. If all cells are filled → puzzle is SOLVED ✅
7. If no digit works for a cell → puzzle has NO SOLUTION ❌
```

**Time Complexity**: O(9^m) where m = number of empty cells  
**Space Complexity**: O(m) for the recursion stack

---

## 📄 License

MIT License — free to use, modify, and distribute.
