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
     * Метод, направленный на замену символ из базового алфавита на символ из алфавита замены,
     * который находится в соответствующей позиции. 
     * Базовый алфавит и алфавит замены определяются объектом.
     * @param toEncrypt - символ, который требуется заменить,
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
	
	/*
     * Зашифровывать заданную строку, используя ключ, установленный для объекта класса Encrypt.
     * @param toEncrypt - строка, которую требуется зашифровать, тип String,
     * @return builder.toString() - результат зашифрованной строки, если удалось зашифровать, тип String.
     * */
	public String encrypt(String toEncrypt) {
        StringBuilder builder = new StringBuilder();
        if (key.getElements() == null) {
            int shear = key.getShearing();
            for (int i = 0; i < toEncrypt.length(); i++) {
                builder.append((char) (shear + Word.DEFAULT_SYMBOL.get(toEncrypt.charAt(i))));
            }
        } else {
            for (int i = 0; i < toEncrypt.length(); i++) {
                char symb = toEncrypt.charAt(i);
                builder.append(encryptChar(symb));
            }
        }
        return builder.toString();
    }
}
