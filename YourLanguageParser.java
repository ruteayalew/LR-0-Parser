public class YourLanguageParser extends LR0Parser {

    public YourLanguageParser() {
        super(); // calls the constructor for LR0Parser

        addRule("R1","Z", "A#"); // Encodes R1: Z --> A#
        addRule("R2", "A", "aA"); // Encodes R2: A --> aA
        addRule("R3", "A", "b"); // Encodes R3: A --> b


        addAction("1", "a", "S4");  // Encodes that state 1, symbol ( results in action S4
        addAction("1", "b", "S3");  // Encodes that state 1, symbol a results in action S3
        addAction("1", "A", "G2");  // Encodes that state 1, symbol S results in action G2
        // -- state 2
        addAction("2", "#", "Accept"); // Encodes that state 2, symbol # results in acion Accept
        // -- state 3
        addAction("3", "a", "R3");
        addAction("3", "b", "R3");
        addAction("3", "#", "R3");
        // -- state 4
        addAction("4", "a", "S4");
        addAction("4", "b", "S3");
        addAction("4", "A", "G5");
        // -- state 5
        addAction("5", "a", "R2");
        addAction("5", "b", "R2");
        addAction("5", "#", "R2");

    }
}
