public class Prac2_1 {
	public static boolean atLeastTwo( boolean a, boolean b, boolean c ) {
		return a ? ( b || c ) : ( b && c );
	}
}