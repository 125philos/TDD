package prog;

public class Word {

	public static final char NULL_SYMBOL = '\u0000'; // null symbol
	private char elementToEncrypt; // encryption element
	
	// constructor
	public Word() {
        this.elementToEncrypt = NULL_SYMBOL;
    }
	
	public void setElementToEncrypt(char symbol) {
        elementToEncrypt = symbol;
    }

    public char getElementToEncrypt() {
        return elementToEncrypt;
    }
}
