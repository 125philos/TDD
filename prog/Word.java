package prog;

import java.util.Arrays;


public class Word {

	public static final char NULL_SYMBOL = '\u0000'; // null symbol
	private char elementToEncrypt; // encryption element
	private char[] elements; // more symbols
	private char[] changeElem; // change elements
	
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
    
    public void setChangeSymbol(char[] changeEl) {
        this.changeElem = changeEl;
    }

    public char[] getChangeSymbol() {
        return changeElem;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Word wor = (Word) obj;
        if (elementToEncrypt != wor.elementToEncrypt) {
            return false;
        }
        if (elements == wor.elements && changeElem == wor.changeElem) {
            return true;
        }
        return Comparer.compareSymbolArrays(elements, wor.elements)
                && Comparer.compareSymbolArrays(changeElem, wor.changeElem);
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.elementToEncrypt;
        hash = 59 * hash + Arrays.hashCode(this.elements);
        hash = 59 * hash + Arrays.hashCode(this.changeElem);
        return hash;
    }
}
