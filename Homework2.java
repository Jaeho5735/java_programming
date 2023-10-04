import java.util.Scanner;

class Student {
    int studentNum;
    String studentName;
    String studentMajor;
    int phoneNum;

    void setStudentNum(int newStudentNum) {
        studentNum = newStudentNum;
    }

    void getStudentNum() {
        System.out.printf("%s ", studentNum);
    }

    void setName(String newName) {
        studentName = newName;
    }

    void getName() {
        System.out.printf("%s ", studentName);
    }

    void setMajor(String newMajor) {
        studentMajor = newMajor;
    }

    void getMajor() {
        System.out.printf("%s ", studentMajor);
    }

    void setPhoneNum(int newPhoneNum) {
        phoneNum = newPhoneNum;
    }

    void getPhoneNum() {
        String newPhoneNum = "0" + Integer.toString(phoneNum);
        newPhoneNum = newPhoneNum.substring(0, 3) + "-" + newPhoneNum.substring(3, 7) + "-" + newPhoneNum.substring(7);
        System.out.printf("%s ", newPhoneNum);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];

        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        s[0] = new Student();
        s[0].setStudentNum(sc.nextInt());
        s[0].setName(sc.next());
        s[0].setMajor(sc.next());
        s[0].setPhoneNum(sc.nextInt());

        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        s[1] = new Student();
        s[1].setStudentNum(sc.nextInt());
        s[1].setName(sc.next());
        s[1].setMajor(sc.next());
        s[1].setPhoneNum(sc.nextInt());

        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        s[2] = new Student();
        s[2].setStudentNum(sc.nextInt());
        s[2].setName(sc.next());
        s[2].setMajor(sc.next());
        s[2].setPhoneNum(sc.nextInt());

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");

        System.out.printf("첫번째 학생: ");
        s[0].getStudentNum();
        s[0].getName();
        s[0].getMajor();
        s[0].getPhoneNum();
        System.out.println();

        System.out.printf("두번째 학생: ");
        s[1].getStudentNum();
        s[1].getName();
        s[1].getMajor();
        s[1].getPhoneNum();
        System.out.println();

        System.out.printf("세번째 학생: ");
        s[2].getStudentNum();
        s[2].getName();
        s[2].getMajor();
        s[2].getPhoneNum();
        System.out.println();
    }
}
