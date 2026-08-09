class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; // Adjust to handle 1-based indexing
            int remainder = columnNumber % 26;
            sb.insert(0, (char) ('A' + remainder));
            columnNumber /= 26;
        }
        
        return sb.toString();
    }
}