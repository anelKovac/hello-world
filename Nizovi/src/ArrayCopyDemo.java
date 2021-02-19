public class ArrayCopyDemo
{
    /*
    U ovom programu cemo vidjeti na primjeru kako kopirati vrijednosti iz jednog u drugi niz
     */
    public static void main(String[] args)
    {
        char[] nizIzKojegKopiramo = {'a', 'e', 'c', 'a', 'f',
                                     'f', 'e', 't', 'i', 'n', 'w', 's'};
        char[] nizUKojiKopiramo = new char[8];
        System.arraycopy(nizIzKojegKopiramo, 2, nizUKojiKopiramo, 0, nizUKojiKopiramo.length);
        System.out.println(nizUKojiKopiramo);
    }
}
