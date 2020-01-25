import model.RegexPhoneFinder;

public class Application {
    public static void main(String args[]){

    /*
    Considering the below text please find using only one regex all phone numbers in this format:
    07xx-xxxxxx
    (07xx)-xxxxx
    07xx xxx xxx
    07xx xxx-xxx
    07xx-xxx-xxx
    The text where you have to find the phone numbers is:
    "0832 973213 ada 074o-123 312 0721 912 123 123 321 212 0732-222111(7480)-732213 0932-213-231(0732)-1321220749 223-102a0792-010-110"
     */

    String theNumbersString = "0832 973213 ada 074o-123 312 0721 912 123 123 321 212 0732-222111(7480)-732213 0932-213-231(0732)-1321220749 223-102a0792-010-110";
    RegexPhoneFinder thePhoneFinder = new RegexPhoneFinder(theNumbersString);
    thePhoneFinder.findAndDisplayPhoneNumbers();

    }
}
