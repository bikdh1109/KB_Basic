package lecture.dto;

import lombok.*;

// Data Transfer Object
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 필드를 매개변수로 받는 생성자
@RequiredArgsConstructor // final, notnull이 붙은 필드가 있으면 이 필드만 초기화시키는 생성자
@Getter
@Setter
// @Data : 권장되지는 않음. -> RequiredArgsConstructor, Getter, Setter, ToString ... 다 합친 것

public class StudentDTO {
    private String name;
    private int age;
    private String email;

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
