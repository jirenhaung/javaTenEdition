package 第十二章;

public class test1 {
public static void main ( String [] args ) {
	try {
		int value=50;
		if ( value < 40 )
			throw new Exception ( " value is too small " ) ;
	}
	catch ( Exception ex ) {
		System . out . println ( ex . getMessage ( )) ;
	}
	System . out . println ( " Continue after the catch block " ) ;
	}
}
