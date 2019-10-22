
public class FakultätRekursiv {

	public static void main(String[] args) 
	{
//		for(int i=0;i<args.length;i++)
//		{
//			System.out.println(args[i]); 
//			//Bei run Pfeil, dann run Configuration, bei arguments, in program arguments etwas eingeben
//		}
		//sysout und dann strg + space
		int n = 7;
		System.out.println(fakultaetRekursiv(n));
	}
	static int fakultaetRekursiv(int n)
	{
		if( n==1)
		{
			return n;
		}else return fakultaetRekursiv(n-1)*n;
		
		
	}

}
