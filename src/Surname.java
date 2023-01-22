public class Surname {
    public static void main(String[] args) {
        String surname = "De Filippi";
        String question;
        question = surname.contains("ni") ?
               "Your surname contains the sequence of letters 'ni'" :
                "Your surname doesn't contains the sequence of letters 'ni'";
        System.out.println(question);
        }
   }
