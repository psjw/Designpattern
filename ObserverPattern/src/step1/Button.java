package step1;

public class Button {

    //notify
    public void onClick(){
        //이벤트 처리
        if(onClickListener!=null)
            onClickListener.onClick(this);
    }

    //ObserverInterface
    public interface OnClickListener{
        public void onClick(Button button);
    }

    private OnClickListener onClickListener;

    //setObserver
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
