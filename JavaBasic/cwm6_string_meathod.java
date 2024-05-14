package JavaBasic;
public class cwm6_string_meathod
{
    public static void main(String[] args)
    {
          String name = "Manish singh";
          String Course = "B.Tech";

          // Length of string
        System.out.println(name.length());

        // Convert all character to lower case
        System.out.println(name.toLowerCase()+ " " +Course.toLowerCase());
        System.out.printf("The normal string is %s and %s after converted into lower case Name = %s and Course = %s",
                name,Course,name.toLowerCase(),Course.toLowerCase());

        // Convert all string to uppercase
        System.out.println(name.toUpperCase()+ " " +Course.toUpperCase());
        System.out.printf("The normal string is %s and %s after converted into Upper case Name = %s and Course = %s \n",
                name,Course,name.toUpperCase(),Course.toUpperCase());

        // to remove all spaces
        System.out.println(name.trim());
        System.out.println(name.length());

        // return substring from specific to end
        System.out.println(name.substring(2));  // nish singh
        System.out.println((name.substring(2,6)));     // nish


        // replace character/string with any other
        System.out.println(name.replace('M','s'));  // Case senstive
        System.out.println(Course.replace("B.Tech","B.C.A"));

        // return true or false with special character
        System.out.println(name.endsWith("Rajput"));
        System.out.println(name.endsWith("gh"));
        System.out.println(Course.startsWith("Ma"));

       //return index
        System.out.println(Course.indexOf('T'));

        // return char at specific index
        System.out.println(Course.charAt(5));

        // return true if same string'
        System.out.println(name.equalsIgnoreCase("manish singh"));  // ignore case sensitivity
        System.out.println(name.equals("manish singh"));  // ignore case sensitivity

    }
}
