package positiondetermination;

public class PositionDetermination {

    public static void main(String[] args) {
        String hamlet = "To be or not to be: that is the question;";
        int index = hamlet.indexOf(':');
        if (index != -1) {
            System.out.println(hamlet.substring(index + 2));
        }
    }
}
