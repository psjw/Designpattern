package mediator;

import contract.Colleague;
import contract.Mediator;

public class ChatMediator extends Mediator {
    @Override
    public void mediate(String data) {
        for (Colleague colleague:
              colleagues) {
            //중재 가능성
            colleague.handle(data);
        }
    }
}
