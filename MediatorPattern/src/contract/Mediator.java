package contract;

import java.util.ArrayList;
import java.util.List;

abstract public class Mediator {
    protected List<Colleague> colleagues;

    public Mediator(){
        colleagues=new ArrayList<>();
    }

    public boolean addColleague(Colleague colleague){
        if(colleagues!=null)
            return colleagues.add(colleague);
        else
            return false;
    }

    public abstract void mediate(String data);
}
