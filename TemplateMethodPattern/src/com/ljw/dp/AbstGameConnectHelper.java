package com.ljw.dp;

public abstract class AbstGameConnectHelper {

    //외부에 노출이 되면 안된다고 private선언하면 안된다.
    //외부에서 재정의하여 호출 가능하도록 protected로 선언
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);


    //템플릿 메소드
    public String requestConnection(String endcoedInfo){
        //보안 과정 -> 암호화 된 문자열을 복호화
        String decodedInfo = doSecurity(endcoedInfo);

        //인증 과정 -> 반환된것을 가지고 아이디, 암호를 할당한다.
        String id="aaa";
        String password="bbb";
        if(!authentication(id,password)){
            throw new Error("아이디 암호 불일치");
        }


        //권한과정
        String userName="userName";
        int i =authorization(userName);

        switch (i){
            case -1:
                throw  new Error("셧다운");
            case 0: //게임 매니저
                break;
            case 1://유료회원
                break;
            case 2://무료회원
                break;
            case 3://권한없음
                break;
            default://기타사항
                break;
        }


        return connection(decodedInfo);
    }

}
