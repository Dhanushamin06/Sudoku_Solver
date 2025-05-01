import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SudokuGUI extends JFrame {
    private JTextField[][] grid = new JTextField[9][9];

    public SudokuGUI() {
        setTitle("Sudoku Solver");
        setLayout(new BorderLayout());

        // Create Sudoku Grid
        JPanel sudokuPanel = new JPanel(new GridLayout(9, 9));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = new JTextField(1);
                grid[i][j].setHorizontalAlignment(JTextField.CENTER);
                sudokuPanel.add(grid[i][j]);
            }
        }
        add(sudokuPanel, BorderLayout.CENTER);

        // Solve Button
        JButton solveButton = new JButton("Solve");
        solveButton.addActionListener(e -> solveSudoku());
        add(solveButton, BorderLayout.SOUTH);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void solveSudoku() {
        int[][] board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                String text = grid[i][j].getText();
                board[i][j] = text.isEmpty() ? 0 : Integer.parseInt(text);
            }
        }
        if (SudokuSolver.solve(board)) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    grid[i][j].setText(String.valueOf(board[i][j]));
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No Solution Exists!");
        }
    }

    public static void main(String[] args) {
        new SudokuGUI();
    }
}