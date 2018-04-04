package prog;

public class Encrypt {

	private Word key;
	//constructor
	public Encrypt()
	{
		key = null;
	}

    public Word getWord() {
        return key;
    }

    public void setWord(Word key) {
        this.key = key;
    }

    /*
     * ћетод, направленный на замену символ из базового алфавита на символ из алфавита замены,
     * который находитс€ в соответствующей позиции. 
     * Ѕазовый алфавит и алфавит замены определ€ютс€ объектом.
     * @param toEncrypt - символ, который требуетс€ заменить,
     * @return - символ замены, если замена удалась,
     * если не удалось найти символ замены или алфавит не определен.
     * */
	public char encryptChar(char toEncrypt) {
		// TODO Auto-generated method stub
		char[] elem = key.getElements();
        if (elem == null) {
            return Word.NULL_SYMBOL;
        }
        for (int i = 0; i < elem.length; i++) {
            if (i > key.getChangeSymbol().length - 1) {
                return Word.NULL_SYMBOL;
            }
            if (elem[i] == toEncrypt) {
                return key.getChangeSymbol()[i];
            }
        }
        return Word.NULL_SYMBOL;
	}

	public char decryptChar(char toDecrypt) {
		// TODO Auto-generated method stub
		char[] elem = key.getChangeSymbol();
        if (elem == null) {
            return Word.NULL_SYMBOL;
        }
        for (int i = 0; i < elem.length; i++) {
            if (i > key.getElements().length - 1) {
                return Word.NULL_SYMBOL;
            }
            if (elem[i] == toDecrypt) {
                return key.getElements()[i];
            }
        }
        return Word.NULL_SYMBOL;
	}
	
}
