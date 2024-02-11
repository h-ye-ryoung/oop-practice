package org.example;

public class User {
    private String password;

    //패스워드 초기화
    public void initPassword(PasswordGenerator passwordGenerator) {

        // as-is 방식 (높은 결합도)
        // RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

        // 랜덤 패스워드 생성
        // to-be 방식 (낮은 결합도)
        String password = passwordGenerator.generatePassword();

        //8자 이상 12자 이하가 아니면 초기화해주지 않도록
        if (password.length() >= 8 && password.length() <=12) {
            this.password = password;
        }
    }

    //generate 탭에서 getter 메소드 선택
    public String getPassword() {
        return password;
    }
}
