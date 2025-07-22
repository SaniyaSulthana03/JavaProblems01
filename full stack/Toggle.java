import java.util.*;

class Toggle {

    // Method to get possible digits for a segment pattern
    public static List<Integer> getPossibleDigits(Map<Integer, String> validDigits, String segmentPattern) {
        List<Integer> possibleDigits = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : validDigits.entrySet()) {
            int mismatches = 0;
            String pattern = entry.getValue();

            // Count the number of mismatches between the given pattern and the valid digit pattern
            for (int i = 0; i < segmentPattern.length(); i++) {
                if (segmentPattern.charAt(i) != pattern.charAt(i)) {
                    mismatches++;
                }
            }

            // If mismatches are less than or equal to 1, it's a valid match
            if (mismatches <= 1) {
                possibleDigits.add(entry.getKey());
            }
        }
        return possibleDigits;
    }

    // Main function to solve the problem
    public static void solve() {
        Scanner scanner = new Scanner(System.in);

        // Read 3 lines of segment patterns
        List<String> segmentPatterns = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            segmentPatterns.add(scanner.nextLine().strip());
        }

        // Read 3 lines of placement patterns
        List<String> placementLines = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            placementLines.add(scanner.nextLine().strip());
        }

        // Create a map for the digit patterns (0-9) from the segment patterns
        Map<Integer, String> digitPatterns = new HashMap<>();
        for (int digit = 0; digit < 10; digit++) {
            StringBuilder pattern = new StringBuilder();
            for (int row = 0; row < 3; row++) {
                pattern.append(segmentPatterns.get(row).substring(digit * 3, (digit + 1) * 3));
            }
            digitPatterns.put(digit, pattern.toString());
        }

        // List to hold possible valid digits for each placement segment
        List<List<Integer>> possibleNumbers = new ArrayList<>();

        // Iterate through each 3-character wide placement segment
        for (int i = 0; i < placementLines.get(0).length() / 3; i++) {
            StringBuilder placementSegment = new StringBuilder();
            for (int row = 0; row < 3; row++) {
                placementSegment.append(placementLines.get(row).substring(i * 3, (i + 1) * 3));
            }

            // Get possible valid digits for this segment
            List<Integer> matchingDigits = getPossibleDigits(digitPatterns, placementSegment.toString());

            // If no matching digits found, the input is invalid
            if (matchingDigits.isEmpty()) {
                System.out.println("Invalid");
                return;
            }

            possibleNumbers.add(matchingDigits);
        }

        // Calculate the sum of all valid combinations of digits
        int totalSum = 0;
        for (List<Integer> combination : getCombinations(possibleNumbers)) {
            StringBuilder number = new StringBuilder();
            for (int digit : combination) {
                number.append(digit);
            }
            totalSum += Integer.parseInt(number.toString());
        }

        System.out.println(totalSum);
    }

    // Helper method to generate all combinations of valid digits
    public static List<List<Integer>> getCombinations(List<List<Integer>> possibleNumbers) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinations(possibleNumbers, 0, new ArrayList<>(), result);
        return result;
    }

    // Recursive backtracking method to generate all combinations
    private static void generateCombinations(List<List<Integer>> possibleNumbers, int index, List<Integer> currentCombination, List<List<Integer>> result) {
        if (index == possibleNumbers.size()) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int digit : possibleNumbers.get(index)) {
            currentCombination.add(digit);
            generateCombinations(possibleNumbers, index + 1, currentCombination, result);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
