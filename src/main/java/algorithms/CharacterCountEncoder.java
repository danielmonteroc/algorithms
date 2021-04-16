package algorithms;

public class CharacterCountEncoder {

	/**
	 * Examples input : "aaaabbbbccccdabc" output: "a4b4c4d1a1b1c1"
	 *
	 * <p>
	 * input: "abc" output: "a1b1c1"
	 *
	 * <p>
	 * input: "" output: ""
	 */
	public static String encode(String input) {
		if (input.isEmpty()) {
			return "";
		}
		int number = 1;
		StringBuilder output = new StringBuilder();
		for (int i = 0; i + 1 < input.length(); i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				number++;
			} else {
				output.append(input.charAt(i));
				output.append(number);
				number = 1;

			}
		}

		output.append(input.charAt(input.length() - 1));
		output.append(number);

		System.out.println(input);
		System.out.println(output.toString());
		return output.toString();
	}
}
