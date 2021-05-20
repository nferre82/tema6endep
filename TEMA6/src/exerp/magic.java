package exerp;

public class magic {

	public static void main(String[] args) {
		int[][]m1=new int [5][5];
		int[]a1=new int[m1.length*m1[0].length];
		for(int i=0;i<a1.length;i++) {
			a1[i]=i+1;
		}
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		for(int i=0, n=0;i<m1.length;i++) {
			for(int j=0;j<m1[0].length;j++) {
				m1[i][j]=0;
				n++;
			}
		}
		for(int i=0, n=0;i<m1.length;i++) {
			for(int j=0;j<m1[0].length;j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		m1[0][(m1[0].length-1)/2]=1;
		for(int i=0, n=0;i<m1.length;i++) {
			for(int j=0;j<m1[0].length;j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		int cont=2;
		int i2=0;
		int j2=(m1[0].length-1)/2;
		System.out.println(i2+" "+j2);
		boolean cambiado=false;
		boolean rebote=false;
		i2--; j2++;
		while(cont<a1.length) {
			cambiado=false;
			rebote=false;
			while(cambiado==false&&rebote==false) {
				if(i2<0&&j2<m1[0].length) {
					System.out.println(i2+" t1 "+j2);
					i2=m1.length-1;
					if(m1[i2][j2]!=0) {
						rebote=false;
					}else {
						rebote=true;
					}
				}else if(i2>=0&&j2>=m1[0].length) {
					System.out.println(i2+" t2 "+j2);
					j2=0;
					System.out.println(i2+" t3 "+j2);
					if(m1[i2][j2]!=0) {
						rebote=false;
					}else {
						rebote=true;
					}
				}else if(i2<0&&j2>=m1[0].length) {
					i2=m1.length-1;
					j2=0;
					System.out.println(i2+" t5 "+j2);
					if(m1[i2][j2]!=0) {
						rebote=false;
					}else {
						rebote=true;
					}
				}else if(m1[i2][j2]!=0&&i2+1<m1.length-1) {
					
						System.out.println(i2+" t5 "+j2);
						i2=i2+2;
						j2=j2-1;
						System.out.println(i2+" t5 "+j2);
						if(m1[i2][j2]!=0) {
							rebote=false;
							i2=1;
							j2=m1[0].length-1;
						}else {
							rebote=true;
						}
						System.out.println(i2+" t5 "+j2);
				}else {
					System.out.println(i2+" t6 "+j2);
					m1[i2][j2]=cont;
					cambiado=true;
					cont++;
					i2--; j2++;
					System.out.println(i2+" t6 "+j2);
					rebote=false;
					
				}
				System.out.println(rebote);
				System.out.println(cambiado);
				for(int i=0, n=0;i<m1.length;i++) {
					for(int j=0;j<m1[0].length;j++) {
						System.out.print(m1[i][j]+"\t");
					}
					System.out.println();
				}
			}
			
			System.out.println(cont);
			
		}
		for(int i=0, n=0;i<m1.length;i++) {
			for(int j=0;j<m1[0].length;j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
