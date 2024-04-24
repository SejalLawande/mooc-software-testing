package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        int begin = 0;
        int end = string.length() - 1;

        while (begin < end && string.charAt(begin) == string.charAt(end)) {
            mirror += string.charAt(begin);
            begin++;
            end--;
        }

        return mirror;
    }

}
