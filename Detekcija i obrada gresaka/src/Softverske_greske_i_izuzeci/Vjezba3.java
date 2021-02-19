package Softverske_greske_i_izuzeci;

/**
 * Data je slijedeca klasa User:
 * public class User
 * {
 *     public int id;
 *     public String firstName;
 *     public String lastName;
 *     public String email;
 *
 *     public User(int id, String firstName, String lastName, String email)
 *     {
 *         this.id = id;
 *         this.firstName = firstName;
 *         this.lastName = lastName;
 *         this.email = email;
 *     }
 *
 * }
 * Potrebno je kreirati klasen izuzetke za nepravilan unos ID-ja, imena, prezimena i e-maila
 *
 * Potrebo je implementirati sistem provjere u konstrukor klase User tako da, ukoliko je id veci od 100,
 * bude emitovan InvalidException i da , ako su firstName, lastName i email polja prazna,
 * bude emitovan InvalidFirstNameException, InvalidLastNameException ili InvalidEmailException.
 *
 */
public class Vjezba3 {

    public static void main(String[] args) {
        try{
            User u = new User(10, "Ben", "Lord", "ben.lord@mail.com");
        }catch(InvalidIdException ex){
            System.out.println("Invalid ID");
        }catch(InvalidFirstNameException ex){
            System.out.println("Invalid name");
        }catch(InvalidLastNameException ex){
            System.out.println("Invalid surname");
        }catch(InvalidEmailException ex){
            System.out.println("Invalid e-mail");
        }
    }
}

    class InvalidEmailException extends Exception{

    }
    class InvalidFirstNameException extends Exception{

    }
    class InvalidIdException extends Exception{

    }
    class InvalidLastNameException extends Exception{

    }
    class User
    {
        public int id;
        public String firstName;
        public String lastName;
        public String email;

        public User(int id, String firstName, String lastName, String email) throws InvalidEmailException, InvalidFirstNameException, InvalidIdException, InvalidLastNameException{
            if(id > 100)
                throw new InvalidIdException();
            else
                this.id = id;
            if(firstName.equals(""))
                throw new InvalidFirstNameException();
            else
                this.firstName = firstName;
            if(lastName.equals(""))
                throw new InvalidLastNameException();
            else
                this.lastName = lastName;
            if(email.equals(""))
                throw new InvalidEmailException();
            else
                this.email = email;
        }

    }


