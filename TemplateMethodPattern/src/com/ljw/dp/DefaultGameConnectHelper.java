package com.ljw.dp;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{
    @Override
    protected String doSecurity(String string) {
        System.out.println("강화된 알고리즘을 이용한 디코드");
        //System.out.println("디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디/암호 확인과정");
        //서버에서 유저이름 유저의 나이를 알 수 있다.
        //나이를 확인하고 시간을 확인하고 성인이 아니고 10시가 자났다면
        //권한이 없는 것으로 한다.
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계!");
        return info;
    }
}
