# Programming Skills - LeetCode Solutions

This repository contains solutions to basic programming problems from LeetCode's Programming Skills study plan (50 Programming Questions).

## Repository Structure

```
.
├── snapshots/              # Screenshots and problem snapshots
├── *.java                 # Solution files
└── README.md              # This file
```

## Solutions

### 1. Find The Difference (LeetCode #389)
**Difficulty:** Easy

**Solutions:**
- `FindTheDifference_Approach1.java` - HashMap approach
  - Time Complexity: O(N + M)
  - Space Complexity: O(1)
- `FindTheDifference_Approach2.java` - Alternative approach
- `FindTheDifference_Approach3.java` - Alternative approach

### 2. Merge Strings Alternately (LeetCode #1768)
**Difficulty:** Easy

**Solutions:**
- `MergeStringsAlternatively.java` - StringBuilder approach
  - Time Complexity: O(N + M)
  - Space Complexity: O(N + M)

### 3. Move Zeroes (LeetCode #283)
**Difficulty:** Easy

**Solutions:**
- `MoveZeroes_Approach1.java` - Two-pointer approach
  - Time Complexity: O(N)
  - Space Complexity: O(1)
- `MoveZeroes_Approach2.java` - Alternative approach

## How to Use Snapshots

The `snapshots/` directory can be used to store:
- Screenshots of LeetCode problem statements
- Execution results and test cases
- Algorithm visualization images
- Complexity analysis diagrams

### Adding Snapshots for a New Problem

1. Create a subdirectory in `snapshots/` named after the problem (e.g., `snapshots/move-zeroes/`)
2. Add relevant screenshots:
   - `problem.png` - The problem statement
   - `example.png` - Example test cases
   - `result.png` - Execution results (optional)
3. Reference the snapshot in this README using relative paths

Example:
```markdown
![Problem Statement](snapshots/move-zeroes/problem.png)
```

## Contributing

When adding a new solution:
1. Name the file using the format: `ProblemName_Approach[N].java`
2. Include time and space complexity in comments
3. Add the solution to this README
4. (Optional) Add problem snapshots to the `snapshots/` directory

## Package Structure

All solutions use the package: `org.programmingskills_leetcode`

## License

This repository is for educational purposes.
