package exerp;

public class ArraysPiz {

	public static void cargarArray(int[][]array) {
		boolean diff;
		int num;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				
					do {
						diff=true;
						num=1+(int)(Math.random()*30);
						for(int k=0;k<array[i].length;k++) {
							if(num==array[i][k]) {
								diff=false;
							}
						}
					}while(diff==false);
					array[i][j]=num;
				}
			}
		}
	public static void ver(int[][] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void ordenarFilas(int[][] array) {
		int aux;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				aux=-1;
				for(int k=j+1;k<array[i].length;k++) {
					if(array[i][j]>array[i][k]) {
						aux=array[i][j];
						array[i][j]=array[i][k];
						array[i][k]=aux;
					}
				}
					
				}
			}
		}
	
	public static void main(String[] args) {
		int [][]numeros=new int[10][8];
		cargarArray(numeros);
		ver(numeros);
		ordenarFilas(numeros);
		ver(numeros);

	}

}
