public class JoinExample {
    public static void main(String[] args) {
        String[] stringArr = {"나는 오늘", "2끼를", "먹었습니다"};
        String str = String.join("!", stringArr); // 구분자, 배열
        System.out.println(str); // 나는 오늘!2끼를!먹었습니다
    }
}
/* 
public static String join(CharSequence delimiter, CharSequence... elements) {
        var delim = delimiter.toString();
        var elems = new String[elements.length];
        for (int i = 0; i < elements.length; i++) {
            elems[i] = String.valueOf(elements[i]);
        }
        return join("", "", delim, elems, elems.length);
    }
*/
