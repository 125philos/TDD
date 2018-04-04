package prog;

public class Comparer {

	static boolean arrayCongruence = false; // flag congruence 
	
	// compare two array
	/*
	 * Метод, который направлен на проверяем конгруэнтность массивов.  
	 * @param arr1 - массив с первым комплектом символов, типа char, 
	 * @param arr2 - массив со вторым комплектом символов, типа char.
	 * @return arrayCongruence - результат сравнения двух массивов, тип boolean.
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
