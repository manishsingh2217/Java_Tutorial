package JavaBasic;
public class exercise3
{
    public static void main(String[] args) {
        char grade = 'B';

//        encrypting grade
        System.out.println("Before Dycrypting ");
        grade = (char)(grade + 8);
        System.out.println(grade);

//        dycrypting grade
        System.out.println("After Dycrpting ");
        grade = (char)(grade -8);
        System.out.println(grade);
    }
}
