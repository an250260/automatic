package mvc.util;

public class Utility {
	public static boolean  checkStringNullAndBlank(final String s ) {
		  // Null-safe, short-circuit evaluation.
		if(s == null){
			return true;
		}else if(s.trim().isEmpty()){
			return true;
		}
		
		return false;
}
	
	public static boolean isInteger( String input )
	{
	   try
	   {
	      Integer.parseInt( input );
	      return true;
	   }
	   catch( Exception e)
	   {
	      return false;
	   }
	}
}
