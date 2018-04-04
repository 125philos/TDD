package prog;

public class Word {

	public static final char NULL_SYMBOL = '\u0000'; // null symbol
	private char elementToEncrypt; // encryption element
	private char[] elements; // more symbols
	
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
    
    public void setElements(char[] elem) {
        this.elements = elem;
    }

    public char[] getElements() {
        return elements;
    }
}
