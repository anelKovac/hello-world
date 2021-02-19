import java.util.Arrays;

public class ArrayCopyofDemo
{
    public static void main(String[] args)
    {
        char[] nizIzKojegKopiramo = {'a', 'e', 'c', 'a', 'f',
                'f', 'e', 't', 'i', 'n', 'w', 's'};
        char[] copyTo = Arrays.copyOfRange(nizIzKojegKopiramo, 2, 10 );
        System.out.println(copyTo);

    }
}
