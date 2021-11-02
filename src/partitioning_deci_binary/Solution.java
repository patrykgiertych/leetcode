package partitioning_deci_binary;

public class Solution {
    public int minPartitions(String n) {
        for (int i = 9; i > 0; i--) {
            if (n.contains(Integer.toString(i))) return i;
        }
        return 0;
    }
}
