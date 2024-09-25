//dahlia tynes
//25/09/2024
//APCSA - Problem Set 2B

class StringTools{
    
    //problem 1
    public String lastLetter(String str){
       return str.substring(str.length()-1);
    }
    
    //problem 2
    public String formatPhoneNumber(String num){
        return "("+num.substring(0,3)+") "+num.substring(3,6)+"-"+num.substring(6);
    }
    
    //problem 3
    public String middleThree(String str){
        int div = (str.length()-3)/2;
        return str.substring(div, div+3);
    }
    
    //problem 4
    public String swapLastTwo(String str){
        String partOne = str.substring(0,str.length()-2);
        String partTwo = str.substring(str.length()-1);
        String partThree = str.substring(str.length()-2,str.length()-1);
        return partOne+partTwo+partThree;
    }
    //problem 5
    
    public String frontAgain(String str, int a){
        String first = str.substring(0,a);
        String last = str.substring(str.length()-a);
         boolean result=first.equals(last);
         return " "+result;
    }
}