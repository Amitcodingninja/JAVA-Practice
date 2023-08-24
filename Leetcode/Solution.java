class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int rem = columnNumber % 26;
            char c = (char) ('A' + rem);
            title.insert(0, c);
            columnNumber /= 26;
        }
        return title.toString();

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int columnNumber = 701;
        String title = sol.convertToTitle(columnNumber);
        System.out.println("The title for column number " + columnNumber + " is " + title);
    }
}
