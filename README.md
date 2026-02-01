# Gamblor

Gamblor is a simple Kotlin-based command-line tool that allows users to simulate gambling scenarios. It provides insights into potential outcomes by running multiple permutations of bets based on user-defined parameters such as bet amount, number of rounds, and winning odds.

## Requirements

To run Gamblor, you need the following:

*   **Java Development Kit (JDK):** Version 8 or higher is recommended.
*   **Kotlin Compiler (kotlinc):** To compile and run the Kotlin source files directly from the command line.

## Setup & Run

### 1. Clone the repository
```bash
git clone <repository-url>
cd gamblor
```

### 2. Compile and Run
You can compile and run the project using the Kotlin compiler:

```bash
# Compile the project
kotlinc src/Main.kt -include-runtime -d gamblor.jar

# Run the simulation
java -jar gamblor.jar
```

Alternatively, if you have Kotlin installed, you can run it directly:
```bash
kotlinc -script src/Main.kt # Note: Main.kt is structured as a standard Kotlin file with a main function, so the JAR approach is preferred.
```

## Usage

When you run the application, it will prompt you for the following inputs:
1.  **Number of rounds:** How many bets to place in one simulation.
2.  **Bet amount:** The amount of money (in whole dollars) to bet each round.
3.  **Winning odds:** The percentage chance (0-100) of winning a single bet.
4.  **Number of simulations:** How many times to repeat the entire set of rounds.

The tool will then output the win rate and total winnings/losses for each simulation, as well as the aggregate result.

