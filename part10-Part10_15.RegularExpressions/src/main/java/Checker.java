public class Checker {

    
    public boolean isDayOfWeek(String input){
        if(input.matches("(mon|tue|wed|thu|fri|sat|sun)")){
            return true;
        } else {
            return false;
        }
    }

    public boolean allVowels(String input){
        if(input.matches("(a|e|i|o|u)*")){
            return true;
        } else {
            return false;
        }
    }

    public boolean timeOfDay(String input){
        if(input.matches("((([0|1])[0-9])|2[0-3]):[0-5][0-9]:[0-5][0-9]")){
            return true;
        } else {
            return false;
        }
    }
}
