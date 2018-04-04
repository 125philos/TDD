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
	
}
