package chapter6;

public class Month {

    public static String getMonth(int month){
        switch(month){
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default:return "Invalid month";
        }
    }

    public static int getMonth(String month){
        switch(month){
        case "January": return 1;
        case "February": return 1;
        case "March": return 1;
        case "April": return 1;
        case "May": return 1;
        case "June": return 1;
        case "July": return 1;
        case "August": return 1;
        case "September": return 1;
        case "October": return 1;
        case "November": return 1;
        case "December": return 1;
        default: return -1;
    }
}
}
