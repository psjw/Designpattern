package step3.step2;

import java.time.LocalDate;
import java.time.Month;

public class TestPattern {
    public static void main(String[] args) {
        Person p1=Person.builder().firstName("FirstName").lastName("LastName").addressOne("상일동 멀다").addressTwo("잠실은 갈만해")
                .birthDate(LocalDate.of(1995, Month.APRIL,13))
                .sex("male")
                .dirvierLicence(true)
                .married(true)
                .build();

        System.out.println(p1.getFirstName());
    }


}
