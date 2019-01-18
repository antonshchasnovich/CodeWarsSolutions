/*
 Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive.
  The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false*/

public class XO {
    public static boolean getXO(String str) {
        int xCount = 0;
        int oCount = 0;
        char[] chars = str.toLowerCase().toCharArray();
        for (char c : chars
        ) {
            if (c == 'x') {
                xCount++;
            } else if (c == 'o') {
                oCount++;
            }
        }
        return xCount == oCount;
    }
}
