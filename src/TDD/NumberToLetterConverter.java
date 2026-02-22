package TDD;

public class NumberToLetterConverter {

    private final String[] letters = {
            "A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"
    };

    public String convert(int number) {
        return letters[number -1];
    }
}
