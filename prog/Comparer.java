package prog;

public class Comparer {

	static boolean arrayCongruence = false; // flag congruence 
	
	// compare two array
	/*
	 * �����, ������� ��������� �� ��������� �������������� ��������.  
	 * @param arr1 - ������ � ������ ���������� ��������, ���� char, 
	 * @param arr2 - ������ �� ������ ���������� ��������, ���� char.
	 * @return arrayCongruence - ��������� ��������� ���� ��������, ��� boolean.
	 * */
	public static boolean compareSymbolArrays(char[] arr1, char[] arr2) {
		arrayCongruence = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
				arrayCongruence = false;
            }
        }
        return arrayCongruence;
    }
}
