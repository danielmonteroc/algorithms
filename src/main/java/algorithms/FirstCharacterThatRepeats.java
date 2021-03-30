package algorithms;

import java.util.HashSet;
import java.util.Set;

public class FirstCharacterThatRepeats {
	/**
	 * Method must return first character repeated in a string if no characters
	 * repeated are found return zero
	 *
	 * <p>
	 * Examples input: "abcabc" Returns: 'a'
	 *
	 * <p>
	 * input: "abcbca" Returns: 'b'
	 *
	 * <p>
	 * input: "" returns: 0
	 *
	 * <p>
	 * input: "abcdefghijklmnopqrstuvwxyz" returns: 0
	 *
	 * <p>
	 * Acceptance criteria:
	 *
	 * <p>
	 * Run unit test (.gradlew test) successfully
	 */
	public static char getFirstRepeatCharacter(String input) {
		Set<Character> visited = new HashSet<>();
		for (char c : input.toCharArray()) {
			if (visited.contains(c)) {
				return c;
			}
			visited.add(c);
		}
		return 0;
	}
}
