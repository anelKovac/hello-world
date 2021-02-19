package kontrola_toka;

public class koristenje_operatora_yield
{
    public static void main(String[] args)
    {
        int value = 0;

        String stringValue = switch (value)
                {
                    case 0:
                        yield "NO";
                    case 1:
                        yield "YES";
                    default:
                        yield "";

                };
        System.out.println(stringValue);
    }


}
