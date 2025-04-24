package lecture.string;

public class StringBuilderExample {
    public static void main(String[] args) {

        /*
            String : 문자열 변경이 일어나면 기존 인스턴스를 수정하는게 아니라 새로운 인스턴스를 반환

            StringBuilder : 문자열에 append 메소드를 사용하면 기존 인스턴스를 수정함

            => 자주 바뀌는 문자열을 StringBuilder 사용이 좋다.
         */

        StringBuilder stringBuilder = new StringBuilder("java");

        System.out.println("sb = " +  stringBuilder);
        System.out.println("sb의 해쉬코드 : " + stringBuilder.hashCode());

        stringBuilder.append("oracle");

        System.out.println("append 이후 sb = " +  stringBuilder);
        System.out.println("append 이후 sb의 해쉬코드 : " + stringBuilder.hashCode());

        /*
            delete() : 시작 인덱스와 종료 인덱스를 이용해 문자열에서 원하는 부분 삭제
            deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나 제거
         */

        System.out.println("delete() : " + stringBuilder.delete(2,5));
        System.out.println("sb = " + stringBuilder);

        /*
            insert() : 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스에 추가
         */

        System.out.println("insert() : "+ stringBuilder.insert(1,"vao"));
        System.out.println("sb = " + stringBuilder);

        /*
            reverse() : 문자열의 순서를 역순으로 바꿈
         */
        System.out.println("reverse() : " + stringBuilder.reverse());
        System.out.println("sb = " + stringBuilder);
    }
}
