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
     * �����, ������������ �� ������ ������ �� �������� �������� �� ������ �� �������� ������,
     * ������� ��������� � ��������������� �������. 
     * ������� ������� � ������� ������ ������������ ��������.
     * @param toEncrypt - ������, ������� ��������� ��������,
     * @return - ������ ������, ���� ������ �������,
     * ���� �� ������� ����� ������ ������ ��� ������� �� ���������.
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
