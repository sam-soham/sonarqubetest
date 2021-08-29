package sonarqubetest.sonarqubetest;

/**
 * Hello world!
 *
 */
public class test 
{
    public static void main( String[] args )
    {
        System.out.println( "Yup!" );
        if(2<3){
        }
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant; target = -3. Is that really what's meant?
        target =+ num;
    }
}
