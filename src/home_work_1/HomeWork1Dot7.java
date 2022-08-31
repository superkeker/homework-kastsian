package home_work_1;

public class HomeWork1Dot7 {
    public static String createPhoneNumber(int[] massive) {
        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append("(");
        for (int i = 0; i <= massive.length-1; i++) {
            phoneNumber.append(massive[i]);
            if(i == 2){
                phoneNumber.append(") ");
            } else if (i == 5) {
                phoneNumber.append("-");
            }
        }
        return String.valueOf(phoneNumber);
        }
}
