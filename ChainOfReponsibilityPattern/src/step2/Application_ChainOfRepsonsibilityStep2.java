package step2;

public class Application_ChainOfRepsonsibilityStep2 {
    public static void main(String[] args) {
        Attack attack=new Attack(100);
        Armor armor1=new Armor(10);
        Armor armor2=new Armor(15);

        armor1.setNextDefense(armor2);
        //첫번째 공격
        armor1.defense(attack);
        System.out.println(attack.getAmount());

        //동적
        Defense defense=new Defense() {
            @Override
            public void defense(Attack attack) {
                int amount=attack.getAmount();
                attack.setAmount(amount-=50);
            }
        };

        //추가 착용
        armor2.setNextDefense(defense);

        //두번째 공격
        attack.setAmount(100);
        armor1.defense(attack);
        System.out.println(attack.getAmount());
    }
}
