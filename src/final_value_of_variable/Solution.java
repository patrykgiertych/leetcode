package final_value_of_variable;

public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].indexOf('-') != -1) {
                res--;
            }
            if (operations[i].indexOf('+') != -1) {
                res++;
            }
        }

        return res;
    }
}
