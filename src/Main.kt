import kotlin.random.Random
import kotlin.math.abs

fun get_num(prompt: String): Int {
    var ans: Int? = null
    while (ans == null) {
        print(prompt)
        ans = readln().toIntOrNull()
    }
    return ans
}

fun run_simulation(betAmount: Int, rounds: Int, winOdds: Int, numPermutations: Int) {
    println()
    println("Running $numPermutations simulation(s) with $rounds rounds, a bet amount of $betAmount, and a $winOdds% chance of winning the bet")

    var totalWinnings = 0

    for (i in 0 ..< numPermutations) {
        var wins = 0
        var winnings = 0

        for (j in 0..<rounds) {
            if (Random.nextInt(100) < winOdds) {
                winnings += betAmount
                wins++
            } else {
                winnings -= betAmount
            }
        }

        totalWinnings += winnings
        println("Win rate: ${(wins / rounds.toDouble()) * 100}%")
        if (winnings >= 0) {
            println("You won: $$winnings!")
        } else {
            println("You lost: $${abs(winnings)}!")
        }
        println()
    }
    println("Your total winnings over $numPermutations simulation(s): $$totalWinnings!")
    println()
}

fun main() {
    while (true) {
        val rounds = get_num("Please enter the number of rounds you want to play: ")
        val betAmount = get_num("Please enter the bet amount in a whole number of dollars: ")
        val winOdds = get_num("Please enter the the odds of winning as a percentage: ")
        val numPermutations = get_num("Please enter the number of simulations you want to run: ")

        run_simulation(betAmount, rounds, winOdds, numPermutations)

    }
}